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
import com.example.candr.test_uncore2.content_main.CustomAdapter3;
import com.example.candr.test_uncore2.content_main.shareClass3;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class thirdFragment extends Fragment {
    View thirdFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass3> arrayData = new ArrayList<shareClass3>();

    public thirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thirdFragment = inflater.inflate(R.layout.fragment_third, container, false);
        lv = (ListView) thirdFragment.findViewById(R.id.lv);
        add= (Button) thirdFragment.findViewById(R.id.addWali);
        arrayData.add(new shareClass3(1,"1","yosua","yosua","jesica","2147483647","yosua@gmail.com"));
        arrayData.add(new shareClass3(2,"2","nau","Tukiman","Tukiyem","2147483647","tukijoman@gmail.com"));
        lv.setAdapter( new CustomAdapter3(getActivity().getApplicationContext(),arrayData));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        return thirdFragment;
    }

}
