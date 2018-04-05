package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 25/12/2016.
 */

public class shareClass extends Activity {
    int id;
    String namaGuru;
    String usernameGuru;
    String kodeGuru;
    String emailguru;
    String kontakGuru;
    String pendidikanGuru;



    public shareClass(int id, String namaGuru, String usernameGuru , String kodeGuru, String emailguru , String kontakGuru, String pendidikanGuru){
        this.id=id;
        this.namaGuru = namaGuru;
        this.usernameGuru = usernameGuru;
        this.kodeGuru = kodeGuru;
        this.emailguru = emailguru;
        this.kontakGuru = kontakGuru;
        this.pendidikanGuru = pendidikanGuru;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return namaGuru;
    }

    public void setName(String name) {
        this.namaGuru = name;
    }

    public String getUsernameGuru() {
        return usernameGuru;
    }

    public void setUsernameGuru(String usernameGuru) {
        this.usernameGuru = usernameGuru;
    }

    public String getKodeGuru() {
        return kodeGuru;
    }

    public void setKodeGuru(String kodeGuru) {
        this.kodeGuru = kodeGuru;
    }

    public String getEmailguru() {
        return emailguru;
    }

    public void setEmailguru(String emailguru) {
        this.emailguru = emailguru;
    }
    public String getKontakGuru() {
        return kontakGuru;
    }

    public void setKontakGuru(String kontakGuru) {
        this.kontakGuru = kontakGuru;
    }

    public String getPendidikanGuru() {
        return pendidikanGuru;
    }

    public void setPendidikanGuru(String PendidikanGuru) {
        this.pendidikanGuru = pendidikanGuru;
    }


}
