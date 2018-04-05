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

public class CustomAdapter6 extends BaseAdapter {
    Context c;
    ArrayList<shareClass6> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter6(Context c,ArrayList<shareClass6>shareclass) {
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
            convertView=inflater.inflate(R.layout.model_partner,parent,false);
        }

        TextView noIDTxt= (TextView) convertView.findViewById(R.id.noID);
        TextView usernamePartnerTxt = (TextView) convertView.findViewById(R.id.usernamePartner);
        TextView namaUsahaTxt = (TextView) convertView.findViewById(R.id.namaUsaha);
        TextView bidangUsahaTxt = (TextView) convertView.findViewById(R.id.bidangUsaha);
        TextView namaPemilikTxt = (TextView) convertView.findViewById(R.id.namaPemilik);
        TextView kontakPartnerTxt = (TextView) convertView.findViewById(R.id.kontakPartner);
        Button details = (Button) convertView.findViewById(R.id.detailPartner);

        //BIND DATA
        shareClass6 shareClasses2=shareClasses.get(position);

        noIDTxt.setText(shareClasses2.getNoID());
        usernamePartnerTxt.setText(shareClasses2.getUsernamePartner());
        namaUsahaTxt.setText(shareClasses2.getNamaUsaha());
        bidangUsahaTxt.setText(shareClasses2.getBidangUsaha());
        namaPemilikTxt.setText(shareClasses2.getNamaPemilik());
        kontakPartnerTxt.setText(shareClasses2.getKontakPartner());
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Under Construction",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
