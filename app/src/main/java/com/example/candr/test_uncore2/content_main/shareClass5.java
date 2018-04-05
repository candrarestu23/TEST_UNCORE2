package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 31/12/2016.
 */

public class shareClass5 extends Activity {
    int id;
    String NoID;
    String kelas;
    String waliKelas;
    String ketuaKelas;




    public shareClass5(int id, String noID, String kelas , String waliKelas, String ketuaKelas){
        this.id=id;
        this.NoID = noID;
        this.kelas = kelas;
        this.waliKelas = waliKelas;
        this.ketuaKelas = ketuaKelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoID() {
        return NoID;
    }

    public void setNoID(String noID) {
        this.NoID = noID;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getWaliKelas() {
        return waliKelas;
    }

    public void setWaliKelas(String waliKelas) {
        this.waliKelas = waliKelas;
    }

    public String getKetuaKelas() {
        return ketuaKelas;
    }

    public void setKetuaKelas(String ketuaKelas){
        this.ketuaKelas = ketuaKelas;
    }


}
