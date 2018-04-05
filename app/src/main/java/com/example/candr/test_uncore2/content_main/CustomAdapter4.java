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
 * Created by candr on 30/12/2016.
 */

public class CustomAdapter4 extends BaseAdapter {
    Context c;
    ArrayList<shareClass4> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter4(Context c, ArrayList<shareClass4>shareclass) {
        this.c = c;
        this.shareClasses = shareclass;

        inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model_siswa,parent,false);
        }

        TextView siswaTxt= (TextView) convertView.findViewById(R.id.kodeSiswa);
        TextView NISTxt = (TextView) convertView.findViewById(R.id.NIS);
        TextView namaSiswaTxt = (TextView) convertView.findViewById(R.id.namaSiswa);
        TextView jenisKelaminSIswaTxt = (TextView) convertView.findViewById(R.id.JenisKelaminSiswa);
        TextView kelasSiswaTxt = (TextView) convertView.findViewById(R.id.kelasSiswa);
        TextView emailSiswaTxt = (TextView) convertView.findViewById(R.id.emailSiswa);
        TextView kontakSiswaTxt = (TextView) convertView.findViewById(R.id.kontakSiswa);
        Button details = (Button) convertView.findViewById(R.id.detailSiswa);


        //BIND DATA
        shareClass4 shareClasses2=shareClasses.get(position);

        siswaTxt.setText(shareClasses2.getKodeSiswa());
        NISTxt.setText(shareClasses2.getNIS());
        namaSiswaTxt.setText(shareClasses2.getName());
        jenisKelaminSIswaTxt.setText(shareClasses2.getJenisKelaminSiswa());
        kelasSiswaTxt.setText(shareClasses2.getKelasSiswa());
        emailSiswaTxt.setText(shareClasses2.getEmailSiswa());
        kontakSiswaTxt.setText(shareClasses2.getKelasSiswa());
        details.setOnClickListener(new View.OnClickListener() {
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
