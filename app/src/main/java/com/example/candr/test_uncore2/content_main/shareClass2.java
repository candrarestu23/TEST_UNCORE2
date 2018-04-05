package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 31/12/2016.
 */

public class shareClass2 extends Activity {
    int id;
    String Nama;
    String userName;
    String email;
    String kontak;
    String jenisKelamin;


    public shareClass2(int id, String userNameStaff, String namaStaff , String emailStaff, String kontakStaff , String jenisKelaminStaff){
        this.id=id;
        this.Nama = namaStaff;
        this.userName = userNameStaff;
        this.email = emailStaff;
        this.kontak = kontakStaff;
        this.jenisKelamin = jenisKelaminStaff;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaStaff() {
        return Nama;
    }

    public void setNamaStaff(String namaStaff) {
        this.Nama = namaStaff;
    }

    public String getUserNameStaff() {
        return userName;
    }

    public void setUsernameStaff(String usernameStaff) {
        this.userName = usernameStaff;
    }

    public String getEmailStaff() {
        return email;
    }

    public void setEmailStaff(String emailStaff) {
        this.email = emailStaff;
    }

    public String getKontakStaff() {
        return kontak;
    }

    public void setKontakStaff(String kontakStaff) {
        this.kontak = kontakStaff;
    }
    public String getJenisKelaminStaff() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelaminStaff) {
        this.jenisKelamin = jenisKelaminStaff;
    }


}
