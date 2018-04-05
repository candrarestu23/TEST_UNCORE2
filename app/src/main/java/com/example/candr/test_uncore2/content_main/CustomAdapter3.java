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

public class CustomAdapter3 extends BaseAdapter{
    Context c;
    ArrayList<shareClass3> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter3(Context c,ArrayList<shareClass3>shareclass) {
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
            convertView=inflater.inflate(R.layout.model_wali,parent,false);
        }
        TextView noID= (TextView) convertView.findViewById(R.id.noID);
        TextView usernameWaliTxt = (TextView) convertView.findViewById(R.id.usernameWali);
        TextView namaAyahTxt = (TextView) convertView.findViewById(R.id.namaAyah);
        TextView namaIbuTxt = (TextView) convertView.findViewById(R.id.namaIbu);
        TextView kontakWaliTxt = (TextView) convertView.findViewById(R.id.kontakWali);
        TextView emailWaliTxt = (TextView) convertView.findViewById(R.id.emailWali);
        Button details = (Button) convertView.findViewById(R.id.detailWali);


        //BIND DATA
        shareClass3 shareClasses2=shareClasses.get(position);

        noID.setText(shareClasses2.getNoID());
        usernameWaliTxt.setText(shareClasses2.getUsernameWali());
        namaAyahTxt.setText(shareClasses2.getNamaAyah());
        namaIbuTxt.setText(shareClasses2.getNamaIbu());
        kontakWaliTxt.setText(shareClasses2.getKontakWali());
        emailWaliTxt.setText(shareClasses2.getEmailWali());
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
