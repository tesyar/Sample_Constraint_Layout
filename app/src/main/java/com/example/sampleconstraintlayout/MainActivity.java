package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String nama,password;
    Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignIn);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               nama = edemail.getText().toString();
               password = edpassword.getText().toString();

               String email = "admin@mail.com";
               String passwords = "123";
                if (nama.equals(email) && password.equals(passwords)){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
                }
                else if(nama.equals(email) && password != passwords){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
                else if(nama != email && password.equals(passwords)){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }
//               t = Toast.makeText(getApplicationContext(), "email anda: " + nama + "dan Password anda: "+ password+ "", Toast.LENGTH_LONG);
//
//               t.show();
           }
        });
    }
}