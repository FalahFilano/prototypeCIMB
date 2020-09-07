package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityFotoSesudahInspeksiBinding;

public class FotoSesudahInspeksi extends AppCompatActivity {

    private ActivityFotoSesudahInspeksiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFotoSesudahInspeksiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Form Inspeksi");

        binding.btnShutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FotoSesudahInspeksi.this, DetailPekerjaan.class);
                intent.putExtra("DONE", true);

                startActivity(intent);
            }
        });
    }
}