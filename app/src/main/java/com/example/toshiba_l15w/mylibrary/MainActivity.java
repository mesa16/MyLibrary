package com.example.toshiba_l15w.mylibrary;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private User user;
    private EditText em, passw;
    private Button login;
    private String id = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       em=(EditText) findViewById(R.id.etemail);
       passw=(EditText) findViewById(R.id.etpa);
       login = (Button) findViewById(R.id.btlogin);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String email1=em.getText().toString().trim();
               String pass1 = passw.getText().toString().trim();

               user = new User(email1);
               if (email1.equals(user.getEmail()) && pass1.equals(user.getPassword())){
                   Toast.makeText(getApplicationContext(), "login anda sukses", Toast.LENGTH_SHORT).show();
                   Intent i = new Intent(MainActivity.this, Beranda.class);
                   i.putExtra(id, user.getEmail());
                   startActivity(i);
                   em.setText(" ");
                   passw.setText("");
               }
               else if ((email1.matches("") || pass1.matches("")))
               {
                   Toast.makeText(getApplicationContext(), " isi nama dan password anda ", Toast.LENGTH_SHORT).show();
               }
               else {
                   Toast.makeText(getApplicationContext(), "login anda gagal", Toast.LENGTH_SHORT).show();
               }
           }
       });
    }

}




