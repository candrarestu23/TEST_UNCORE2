package com.example.candr.test_uncore2.content_main;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.candr.test_uncore2.MainActivity;
import com.example.candr.test_uncore2.R;

/**
 * Created by candr on 25/12/2016.
 */

public class result extends Activity {
    ImageView image,appbar;
    TextView alamat,jam_buka,nama_toko,phone,deskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        image = (ImageView)findViewById(R.id.gambar_toko);
        alamat = (TextView)findViewById(R.id.alamat_toko);
        jam_buka = (TextView) findViewById(R.id.jam_toko);
        nama_toko = (TextView) findViewById(R.id.nama_toko);
        phone = (TextView) findViewById(R.id.phone_toko);
        deskripsi = (TextView)findViewById(R.id.deskripsi_toko);

        Intent i = getIntent();
        String iGambar = i.getStringExtra("picture");
        String iJam = i.getStringExtra("jam_buka");
        String iAlamat = i.getStringExtra("alamat");
        String iToko = i.getStringExtra("penjual");
        String iPhone = i.getStringExtra("phone");
        String iDeskripsi = i.getStringExtra("deskripsi");

        String mDrawableName = iGambar;
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
        image.setImageResource(resID);
        alamat.setText(iAlamat);
        nama_toko.setText(iToko);
        jam_buka.setText(iJam);
        phone.setText(iPhone);
        deskripsi.setText(iDeskripsi);

        Toolbar appbar = (Toolbar) findViewById(R.id.app_bar);
        Transition exit = new Explode();
        Transition enter = new Slide();
        getWindow().setEnterTransition(enter);
        getWindow().setExitTransition(exit);
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(result.this, MainActivity.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(result.this).toBundle());
            }
        });

        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout)).setTitle(iToko);

    }
}