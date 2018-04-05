package com.example.candr.test_uncore2.content_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candr.test_uncore2.R;

import java.util.ArrayList;

/**
 * Created by candr on 31/12/2016.
 */

public class CustomAdapter5 extends BaseAdapter {
    Context c;
    ArrayList<shareClass5> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter5(Context c, ArrayList<shareClass5> shareclass) {
        this.c = c;
        this.shareClasses = shareclass;

        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return shareClasses.size();
    }

    @Override
    public Object getItem(int position) {
        return shareClasses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.model_kelas, parent, false);
        }

        TextView noID = (TextView) convertView.findViewById(R.id.noID);
        TextView kelasTxt = (TextView) convertView.findViewById(R.id.kelas);
        TextView waliKelasTxt = (TextView) convertView.findViewById(R.id.waliKelas);
        TextView ketuaKelasTxt = (TextView) convertView.findViewById(R.id.ketuaKelas);
        Button details = (Button) convertView.findViewById(R.id.detailKelas);
        Button update = (Button) convertView.findViewById(R.id.updateKelas);


        //BIND DATA
        shareClass5 shareClasses2 = shareClasses.get(position);

        noID.setText(shareClasses2.getNoID());
        kelasTxt.setText(shareClasses2.getKelas());
        waliKelasTxt.setText(shareClasses2.getWaliKelas());
        ketuaKelasTxt.setText(shareClasses2.getKetuaKelas());
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Under Construction",Toast.LENGTH_SHORT).show();
            }
        });

        //IMG
        //PicassoClient.downloadImage(c,spacecraft.getImageUrl(),img);


        return convertView;
    }
}