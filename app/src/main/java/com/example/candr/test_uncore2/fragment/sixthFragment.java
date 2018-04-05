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
import com.example.candr.test_uncore2.content_main.CustomAdapter6;
import com.example.candr.test_uncore2.content_main.shareClass6;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class sixthFragment extends Fragment {
    View sixthFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass6> arrayData = new ArrayList<shareClass6>();

    public sixthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        sixthFragment = inflater.inflate(R.layout.fragment_sixth, container, false);
        lv = (ListView) sixthFragment.findViewById(R.id.lv);
        add= (Button) sixthFragment.findViewById(R.id.addPartner);

        arrayData.add(new shareClass6(1,"1","IFC","Ikhwan Fried Chicken","Kantin","Ikhwan Faris Aja","2147483647"));
        arrayData.add(new shareClass6(2,"2","tarwan","Warung Kopi Wawan","Kantin","Ikhwan aja deh","2147483647"));
        lv.setAdapter( new CustomAdapter6(getActivity().getApplicationContext(),arrayData));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        return sixthFragment;
    }

}
