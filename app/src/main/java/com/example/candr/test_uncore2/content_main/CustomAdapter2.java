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

public class CustomAdapter2 extends BaseAdapter{
    Context c;
    ArrayList<shareClass2> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter2(Context c,ArrayList<shareClass2>shareclass) {
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
            convertView=inflater.inflate(R.layout.model_staff,parent,false);
        }
        TextView usernameStaffTxt= (TextView) convertView.findViewById(R.id.usernameStaff);
        TextView namaStaffTxt = (TextView) convertView.findViewById(R.id.namaStaff);
        TextView emailStaffTxt = (TextView) convertView.findViewById(R.id.emailStaff);
        TextView kontakStaffTxt = (TextView) convertView.findViewById(R.id.kontakStaff);
        TextView jenisKelaminStaffTxt = (TextView) convertView.findViewById(R.id.jenisKelaminStaff);
        Button details = (Button) convertView.findViewById(R.id.detailStaff);


        //BIND DATA
        shareClass2 shareClasses2=shareClasses.get(position);

        usernameStaffTxt.setText(shareClasses2.getUserNameStaff());
        namaStaffTxt.setText(shareClasses2.getNamaStaff());
        emailStaffTxt.setText(shareClasses2.getEmailStaff());
        kontakStaffTxt.setText(shareClasses2.getKontakStaff());
        jenisKelaminStaffTxt.setText(shareClasses2.getJenisKelaminStaff());
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
