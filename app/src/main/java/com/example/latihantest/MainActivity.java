package com.example.latihantest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran;
    EditText etNama;
    Button btnNama;
    String nomorPendaftaran, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama = etNama.getText().toString();

                if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("No Pendaftaran Harus Diisi!");
                }
                else if(nama.trim().equals("")){
                    etNama.setError("Nama Harus Diisi");
                }
                else{
                    Toast.makeText(MainActivity.this, "Selamat " + nama + ", Anda Terdaftar!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}