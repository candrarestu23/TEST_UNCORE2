package com.example.candr.test_uncore2.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.candr.test_uncore2.R;
import com.example.candr.test_uncore2.content_main.CustomAdapter4;
import com.example.candr.test_uncore2.content_main.shareClass4;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class fourthFragment extends Fragment {
    View fourtFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass4> arrayData = new ArrayList<shareClass4>();
    ImageButton nasi_timbel_fragment, lotek_fragment;
    public fourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fourtFragment = inflater.inflate(R.layout.fragment_fourth, container, false);
        lv = (ListView) fourtFragment.findViewById(R.id.lv);
        add= (Button) fourtFragment.findViewById(R.id.addsiswa);
        arrayData.add(new shareClass4(1,"Nurjannah Ayu Utami","1103144123","Perempuan","1","1","nurtami@gmail.com","2147483647"));
        lv.setAdapter( new CustomAdapter4(getActivity().getApplicationContext(),arrayData));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        return fourtFragment;
    }

}
