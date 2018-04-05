package com.example.candr.test_uncore2.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.candr.test_uncore2.R;
import com.example.candr.test_uncore2.content_main.CustomAdapter;
import com.example.candr.test_uncore2.content_main.listviewResult;
import com.example.candr.test_uncore2.content_main.shareClass;

import java.util.ArrayList;




/**
 * A simple {@link Fragment} subclass.
 */
public class firstFragment extends Fragment {
    View firstFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass> arrayData = new ArrayList<shareClass>();


    public firstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        firstFragment = inflater.inflate(R.layout.fragment_first, container, false);
        lv = (ListView) firstFragment.findViewById(R.id.lv);
        add= (Button) firstFragment.findViewById(R.id.addguru);
        context = firstFragment.this;
        listviewResult fragmentFirstResult[] = new listviewResult[100];
            arrayData.add(new shareClass(1,"Yudi","Yudi","1","yudi@gmail.com","2147483647","S1 Pendidikan Bahasa Ingg"));
            arrayData.add(new shareClass(2,"Tukiman","Paijo","2","paijo.bieber@gmail.com","2147483647","S1 Sastra Komputer"));
            lv.setAdapter( new CustomAdapter(getActivity().getApplicationContext(),arrayData));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        return firstFragment;
    }


}
