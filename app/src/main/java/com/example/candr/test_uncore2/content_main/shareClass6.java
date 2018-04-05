package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 31/12/2016.
 */

public class shareClass6 extends Activity {
    int id;
    String noID;
    String usernamePartner;
    String namaUsaha;
    String bidangUsaha;
    String namaPemilik;
    String kontakPartner;



    public shareClass6(int id, String noID, String usernamePartner , String namaUsaha, String bidangUsaha , String namaPemilik, String kontakPartner){
        this.id=id;
        this.noID = noID;
        this.usernamePartner = usernamePartner;
        this.namaUsaha = namaUsaha;
        this.bidangUsaha = bidangUsaha;
        this.namaPemilik = namaPemilik;
        this.kontakPartner = kontakPartner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoID() {
        return noID;
    }

    public void setNoID(String noId) {
        this.noID = noID;
    }

    public String getUsernamePartner() {
        return usernamePartner;
    }

    public void setUsernamePartner(String usernamePartner) {
        this.usernamePartner = usernamePartner;
    }

    public String getNamaUsaha() {
        return namaUsaha;
    }

    public void setNamaUsaha(String namaUsaha) {
        this.namaUsaha = namaUsaha;
    }

    public String getBidangUsaha() {
        return bidangUsaha;
    }

    public void setBidangUsaha(String bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getKontakPartner() {
        return kontakPartner;
    }

    public void setKontakPartner(String kontakPartner) {
        this.kontakPartner = kontakPartner;
    }
}
