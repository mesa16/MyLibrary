package com.example.toshiba_l15w.mylibrary;

/**
 * Created by TOSHIBA-L15W on 12/5/2017.
 */

class Pinjaman {
    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    private String tanggalpinjam;
    private String tanggalkembali;
    private String id_member;
    private Buku buku;

    private String[][] data = new String[][]{
            {"22001","10 Januari 2017","13 Januari 2017","51012"},
            {"22002","20 Januari 2017", "23 Januari 2017","51013"}
    };
    public Pinjaman (String id_member) {
        this.id_member = id_member;
        this.cariMember();
    }


    public String getTanggalpinjam(String tanggalpinjam) {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    private void cariMember(){
        for (int i=0; i<this.data.length; i++){
            if (this.id_member.equals(this.data[i][0])){
                this.tanggalpinjam =this.data[i][1];
                this.tanggalkembali = this.data[i][2];
                this.buku = new Buku(data[i][3]);
            }
        }
    }

}
