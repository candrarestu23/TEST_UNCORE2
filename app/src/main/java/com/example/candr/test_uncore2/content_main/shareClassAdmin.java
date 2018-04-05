package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 31/12/2016.
 */

public class shareClassAdmin extends Activity {
    int id;
    String usernameAdmin;
    String namaAdmin;
    String emailAdmin;
    String kontakAdmin;
    String jenisKelaminAdmin;



    public shareClassAdmin(int id, String usernameAdmin, String namaAdmin , String emailAdmin, String kontakAdmin, String jenisKelaminAdmin){
        this.id=id;
        this.usernameAdmin = usernameAdmin;
        this.namaAdmin = namaAdmin;
        this.emailAdmin = emailAdmin;
        this.kontakAdmin = kontakAdmin;
        this.jenisKelaminAdmin = jenisKelaminAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKontakAdmin() {
        return kontakAdmin;
    }

    public void setKontakAdmin(String kontakAdmin) {
        this.kontakAdmin = kontakAdmin;
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String kodeGuru) {
        this.namaAdmin = namaAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }
    public String getJenisKelaminAdmin() {
        return jenisKelaminAdmin;
    }

    public void setJenisKelaminAdmin(String jenisKelaminAdmin) {
        this.jenisKelaminAdmin = jenisKelaminAdmin;
    }

}
