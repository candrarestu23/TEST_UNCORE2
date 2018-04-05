package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 31/12/2016.
 */

public class shareClass3 extends Activity{
    int id;
    String noID;
    String usernameWali;
    String namaAyah;
    String namaIbu;
    String kontakWali;
    String emailWali;



    public shareClass3(int id, String noID, String usernameWali , String namaAyah, String namaIbu , String kontakWali, String emailWali){
        this.id=id;
        this.noID = noID;
        this.usernameWali = usernameWali;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.kontakWali = kontakWali;
        this.emailWali = emailWali;
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

    public void setNoID(String noID) {
        this.noID = noID;
    }

    public String getUsernameWali() {
        return usernameWali;
    }

    public void setUsernameWali(String usernameWali) {
        this.usernameWali = usernameWali;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String setNama) {
        this.namaIbu = namaIbu;
    }
    public String getKontakWali() {
        return kontakWali;
    }

    public void setKontakWali(String kontakWali) {
        this.kontakWali = kontakWali;
    }

    public String getEmailWali() {
        return emailWali;
    }

    public void setEmailWali(String emailWali) {
        this.emailWali = emailWali;
    }

}
