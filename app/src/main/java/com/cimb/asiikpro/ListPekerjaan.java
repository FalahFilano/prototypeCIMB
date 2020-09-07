package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityListPekerjaanBinding;

public class ListPekerjaan extends AppCompatActivity {

    private ActivityListPekerjaanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListPekerjaanBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("List Pekerjaan");

        binding.materialCardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListPekerjaan.this, DetailPekerjaan.class));
            }
        });

    }
}
