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

public class CustomAdapterAdmin extends BaseAdapter {
    Context c;
    ArrayList<shareClassAdmin> shareClasses;

    LayoutInflater inflater;

    public CustomAdapterAdmin(Context c,ArrayList<shareClassAdmin>shareclass) {
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
            convertView=inflater.inflate(R.layout.model_admin,parent,false);
        }

        TextView usernameAdminTxt= (TextView) convertView.findViewById(R.id.usernameAdmin);
        TextView namaAdminTxt = (TextView) convertView.findViewById(R.id.namaAdmin);
        TextView emailAdmin = (TextView) convertView.findViewById(R.id.emailAdmin);
        TextView kontakAdmin = (TextView) convertView.findViewById(R.id.kontakAdmin);
        TextView jenisKelaminAdmin = (TextView) convertView.findViewById(R.id.jenisKelaminAdmin);
        Button details = (Button) convertView.findViewById(R.id.detailAdmin);



        //BIND DATA
        shareClassAdmin shareClasses2=shareClasses.get(position);

        usernameAdminTxt.setText(shareClasses2.getUsernameAdmin());
        namaAdminTxt.setText(shareClasses2.getNamaAdmin());
        emailAdmin.setText(shareClasses2.getEmailAdmin());
        kontakAdmin.setText(shareClasses2.getKontakAdmin());
        jenisKelaminAdmin.setText(shareClasses2.getJenisKelaminAdmin());
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Under Construction",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
