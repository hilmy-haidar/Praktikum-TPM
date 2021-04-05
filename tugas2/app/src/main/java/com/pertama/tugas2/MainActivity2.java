package com.pertama.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvNama, tvNim, tvNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvNim = findViewById(R.id.tv_nim);
        tvNilai = findViewById(R.id.tv_nilai);

        Intent intent = getIntent();

        String terimaNama = intent.getStringExtra("nama");
        String terimaNim = intent.getStringExtra("nim");
        String terimaNilai = intent.getStringExtra("nilaii");

        tvNama.setText(terimaNama);
        tvNim.setText(terimaNim);
        tvNilai.setText(terimaNilai);
    }
}