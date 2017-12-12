package com.example.toshiba_l15w.mylibrary;

/**
 * Created by TOSHIBA-L15W on 12/5/2017.
 */

class Buku  {
    private String id_buku;
    private String judul;
    private String author;
    private String publisher;


    private String [][] data = new String[][]{
            {"51012","pemprograman","mesa","kharisma"},
            {"51013","IT","Evelin","kharisma"}

    };
    public Buku (String id_buku)
    {
        this.id_buku=id_buku;
        this.cariId();
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {

        this.id_buku = id_buku;
        this.cariId();
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public void cariId(){
        for (int i=0; i<this.data.length; i++){
            if (this.id_buku.equals(this.data[i][0])){
                this.judul = this.data[i][1];
                this.author = this.data[i][2];
                this.publisher = this.data[i][3];
            }
        }
    }
}
