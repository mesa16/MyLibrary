package com.example.toshiba_l15w.mylibrary;

/**
 * Created by TOSHIBA-L15W on 12/4/2017.
 */

public class User extends Members {
    private String email;
    private String password;
    private String namalengkap;
    private String telepon;
    private String idmember;

    private String[][] data =new String [][]{
            {"mesa_16@kharisma.ac.id","mesa11","mesa","08123445364","22001"},
            {"evelin_16@kharisma.ac.id","evelin","evelin","082131736716","22002"},
            {"regina_16@kharisma.ac.id","regina","regina","08436615635","22003"}
    };
    public void setData(String[][] data){
        this.data=data;
    }
    public String getIdmember() {
        return idmember;
    }

    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
        this.cariemail();
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

    public User (String email){
        this.email=email;
        this.cariemail();
    }

    private void cariemail() {
        for (int i=0; i<this.data.length; i++){
            if (this.email.equals(this.data[i][0])) {
                this.password=this.data[i][1];
                this.namalengkap=this.data[i][2];
                this.telepon=this.data[i][3];
                this.idmember=this.data[i][4];

            }
        }
    }

}
