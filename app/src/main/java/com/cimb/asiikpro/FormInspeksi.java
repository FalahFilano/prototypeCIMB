package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityFormInspeksiBinding;

public class FormInspeksi extends AppCompatActivity {
    private ActivityFormInspeksiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormInspeksiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Form Inspeksi");

        binding.btnShutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormInspeksi.this, IsiInspeksi.class));
            }
        });
    }
}
