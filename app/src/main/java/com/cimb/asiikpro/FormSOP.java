package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityFormSOPBinding;

public class FormSOP extends AppCompatActivity {

    private ActivityFormSOPBinding binding;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormSOPBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Form SOP");

        binding.btnKirimSop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormSOP.this, DetailPekerjaan.class);
                intent.putExtra("FormSOP", true);
                startActivity(intent);
            }
        });
    }
}
