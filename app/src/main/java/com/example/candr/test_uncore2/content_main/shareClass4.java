package com.example.candr.test_uncore2.content_main;

import android.app.Activity;

/**
 * Created by candr on 30/12/2016.
 */

public class shareClass4 extends Activity{
        int id;
        String namaSiswa;
        String NIS;
        String jenisKelamin;
        String kodeSiswa;
        String kelasSiswa;
        String emailSiswa;
        String kontakSiswa;


        public shareClass4(int id, String namaSiswa,String NIS, String jenisKelamin, String kodeSiswa, String kelasSiswa, String emailSiswa, String kontakSiswa) {
            this.id = id;
            this.namaSiswa = namaSiswa;
            this.NIS = NIS;
            this.jenisKelamin = jenisKelamin;
            this.kodeSiswa = kodeSiswa;
            this.kelasSiswa = kelasSiswa;
            this.emailSiswa = emailSiswa;
            this.kontakSiswa = kontakSiswa;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return namaSiswa;
        }

        public void setName(String name) {
            this.namaSiswa = name;
        }

        public String getNIS() {
            return NIS;
        }

        public void setNIS(String NIS) {
            this.NIS = NIS;
        }

        public String getKodeSiswa() {
            return kodeSiswa;
        }

        public void setKodeSiswa(String kodeGuru) {
            this.kodeSiswa = kodeSiswa;
        }

        public String getKelasSiswa() {
            return kelasSiswa;
        }

        public void setKelasSiswa(String kelasSiswa) {
            this.kelasSiswa = kelasSiswa;
        }
        public String getKontakSiswa() {
            return kontakSiswa;
        }

        public void setKontakSiswa(String kontakSiswa) {
            this.kontakSiswa = kontakSiswa;
        }

        public String getEmailSiswa() {
            return emailSiswa;
        }

        public void setEmailSiswa(String emailSiswa) {
            this.emailSiswa = emailSiswa;
        }
        public String getJenisKelaminSiswa(){
            return jenisKelamin;
        }
        public void setJenisKelaminSiswa(String jenisKelamin){
            this.jenisKelamin = jenisKelamin;
        }

}
