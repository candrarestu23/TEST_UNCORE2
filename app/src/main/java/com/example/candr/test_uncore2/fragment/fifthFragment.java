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
import com.example.candr.test_uncore2.content_main.CustomAdapter5;
import com.example.candr.test_uncore2.content_main.shareClass5;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class fifthFragment extends Fragment {
    View fifthFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass5> arrayData = new ArrayList<shareClass5>();

    public fifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fifthFragment = inflater.inflate(R.layout.fragment_fifth, container, false);
        lv = (ListView) fifthFragment.findViewById(R.id.lv);
        add= (Button) fifthFragment.findViewById(R.id.addKelas);

        arrayData.add(new shareClass5(1,"1","12 IPS-04","2","1103144123"));
        arrayData.add(new shareClass5(2,"2","7 IPA-01","1","1103144124"));
        lv.setAdapter( new CustomAdapter5(getActivity().getApplicationContext(),arrayData));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        return fifthFragment;
    }

}
