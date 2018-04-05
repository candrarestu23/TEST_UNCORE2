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
import com.example.candr.test_uncore2.content_main.CustomAdapterAdmin;
import com.example.candr.test_uncore2.content_main.shareClassAdmin;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class adminFragment extends Fragment {
    View adminFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClassAdmin> arrayData = new ArrayList<shareClassAdmin>();

    public adminFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adminFragment = inflater.inflate(R.layout.fragment_admin, container, false);
        lv = (ListView) adminFragment.findViewById(R.id.lv);
        add= (Button) adminFragment.findViewById(R.id.addAdmin);

        arrayData.add(new shareClassAdmin(1,"admin","admin","admin@netgate.co.id","08","Laki-Laki"));
        arrayData.add(new shareClassAdmin(2,"angguncs","Anggun Cipta Sasmi","angguncs@gmail.com","085772733141","Perempuan"));
        arrayData.add(new shareClassAdmin(3,"primakashi","Claudia Cahya Primadani","prima@gmail.com","082114119800","Perempuan"));
        arrayData.add(new shareClassAdmin(4,"jukidong","Oki Marzuqi","btcrifata@gmail.com","082240118687","Laki-Laki"));
        lv.setAdapter( new CustomAdapterAdmin(getActivity().getApplicationContext(),arrayData));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        return adminFragment;
    }

}
