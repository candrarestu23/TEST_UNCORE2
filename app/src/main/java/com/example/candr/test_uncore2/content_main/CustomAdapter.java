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

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<shareClass> shareClasses;

    LayoutInflater inflater;

    public CustomAdapter(Context c,ArrayList<shareClass>shareclass) {
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
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        TextView guruTxt= (TextView) convertView.findViewById(R.id.kodeguru);
        TextView usernameGuruTxt = (TextView) convertView.findViewById(R.id.usernameguru);
        TextView namaGuruTxt = (TextView) convertView.findViewById(R.id.namaguru);
        TextView emailGuruTxt = (TextView) convertView.findViewById(R.id.emailguru);
        TextView kontakGuruTxt = (TextView) convertView.findViewById(R.id.kontakguru);
        TextView pendidikanTerakhirGuruTxt = (TextView) convertView.findViewById(R.id.pendidikanguru);
        Button details = (Button) convertView.findViewById(R.id.detailGuru);


        //BIND DATA
        shareClass shareClasses2=shareClasses.get(position);

        guruTxt.setText(shareClasses2.getName());
        usernameGuruTxt.setText(shareClasses2.getUsernameGuru());
        namaGuruTxt.setText(shareClasses2.getName());
        emailGuruTxt.setText(shareClasses2.getEmailguru());
        kontakGuruTxt.setText(shareClasses2.getKontakGuru());
        pendidikanTerakhirGuruTxt.setText(shareClasses2.getPendidikanGuru());
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
