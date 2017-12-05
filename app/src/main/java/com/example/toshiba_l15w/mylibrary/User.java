package com.example.toshiba_l15w.mylibrary;

/**
 * Created by TOSHIBA-L15W on 12/4/2017.
 */

public class User {
    private String email;
    private String password;
    private String namalengkap;
    private String telepon;


    private String[][] data =new String [][]{
            {"mesa_16@kharisma.ac.id","mesa","mesa","08123445364"},
            {"evelin_16@kharisma.ac.id","evelin","evelin","082131736716"},
            {"regina_16@kharisma.ac.id","regina","regina","08436615635"}
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
