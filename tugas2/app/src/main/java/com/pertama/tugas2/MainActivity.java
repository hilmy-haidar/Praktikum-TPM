package com.pertama.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSubmit;
    private EditText etNama, etNIM, etNilai;
    String hasilConvert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etNIM = findViewById(R.id.et_nim);
        etNilai = findViewById(R.id.et_nilai);

        btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = etNilai.getText().toString().trim();
                    String sNama = etNama.getText().toString().trim();
                    String sNim = etNIM.getText().toString().trim();

                    if (sNama.trim().equals("")){
                        etNama.setError("Nama Tidak Boleh Kosong");
                    } else if (sNim.trim().equals("")){
                        etNIM.setError("NIM Tidak Boleh Kosong");
                    } else if (sNilai.trim().equals("")){
                        etNilai.setError("Nilai Tidak Boleh Kosong");
                    } else {
                        double nilai = Double.parseDouble(sNilai);

                        if (nilai <= 4 && nilai >3.66) {
                            hasilConvert = String.valueOf('A');
                        } else if (nilai <= 3.66 && nilai >3.33){
                            hasilConvert = "A-";
                        } else if (nilai <= 3.33 && nilai >3.00) {
                            hasilConvert = "B+";
                        } else if (nilai <= 3.00 && nilai >2.66) {
                            hasilConvert = "B";
                        } else if (nilai <= 2.66 && nilai >2.33) {
                            hasilConvert = "B-";
                        } else if (nilai <= 2.33 && nilai >2.00) {
                            hasilConvert = "C+";
                        } else if (nilai <= 2.00 && nilai >1.66) {
                            hasilConvert = "C";
                        } else if (nilai <= 1.66 && nilai >1.33) {
                            hasilConvert = "C-";
                        } else if (nilai <= 1.33 && nilai >1.00) {
                            hasilConvert = "D+";
                        } else if (nilai <= 1.00) {
                            hasilConvert = "D";
                        } else {
                            etNilai.setError("Masukkan nilai yang benar!");
                        }

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                        intent.putExtra("nama", sNama);
                        intent.putExtra("nim", sNim);
                        intent.putExtra("nilaii", hasilConvert);

                        startActivity(intent);
                    }
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}