package com.example.candr.test_uncore2.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.candr.test_uncore2.R;
import com.example.candr.test_uncore2.content_main.CustomAdapter2;
import com.example.candr.test_uncore2.content_main.shareClass2;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class secondFragment extends Fragment {
    View secondFragment;
    ListView lv;
    String label;
    Button add;
    com.example.candr.test_uncore2.fragment.firstFragment context;
    ArrayList<shareClass2> arrayData = new ArrayList<shareClass2>();
    ImageButton ampera_fragment,nasi_bancakan_fragment;
    public secondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        secondFragment = inflater.inflate(R.layout.fragment_second,container,false);
        lv = (ListView) secondFragment.findViewById(R.id.lv);
        add= (Button) secondFragment.findViewById(R.id.addguru);

        arrayData.add(new shareClass2(1,"rudird","rudi rd","rudird@gmail.com","2147483647","Laki-Laki"));
        lv.setAdapter( new CustomAdapter2(getActivity().getApplicationContext(),arrayData));


        return secondFragment;
    }

}
