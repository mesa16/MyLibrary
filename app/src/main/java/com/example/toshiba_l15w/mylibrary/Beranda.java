package com.example.toshiba_l15w.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class Beranda extends AppCompatActivity {
    private TextView anggota, nama, email, program, author, publis, tanggalpin, tanggalkem;
    private User user;
    private Pinjaman pinjaman;
    private String id ="id";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);


        anggota = (TextView) findViewById(R.id.noanggota);
        nama = (TextView) findViewById(R.id.tvnama);
        email= (TextView) findViewById(R.id.tvemail);
        program = (TextView) findViewById(R.id.tvprogram);
        author = (TextView) findViewById(R.id.tvauthor);
        publis = (TextView) findViewById(R.id.tvpublis);
        tanggalpin = (TextView) findViewById(R.id.tvtanggalpinjam);
        tanggalkem = (TextView)findViewById(R.id.tvtanggalkembali);

        Bundle tambah = getIntent().getExtras();
        id = tambah.getString(id);
        email.setText(id);
        String id_member = email.getText().toString().trim();

        if (!TextUtils.isEmpty(id_member)) {
            user = new User(id_member);
            nama.setText(user.getNamalengkap());
            anggota.setText(user.getIdmember());
            pinjaman = new Pinjaman(id_member);
        }
        id_member = anggota.getText().toString().trim();
        if (!TextUtils.isEmpty(id_member)) {
            pinjaman = new Pinjaman(id_member);
            program.setText(pinjaman.getBuku().getJudul());
            author.setText(pinjaman.getBuku().getAuthor());
            publis.setText(pinjaman.getBuku().getPublisher());
            tanggalpin.setText(pinjaman.getTanggalpinjam());
            tanggalkem.setText(pinjaman.getTanggalkembali());

        }



    }

}
