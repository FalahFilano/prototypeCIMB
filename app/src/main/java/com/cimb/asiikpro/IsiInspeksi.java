package com.cimb.asiikpro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.cimb.asiikpro.databinding.ActivityIsiInspeksiBinding;

public class IsiInspeksi extends AppCompatActivity {

    private ActivityIsiInspeksiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIsiInspeksiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Form Inspeksi");


        setDropdown();

        binding.BtnUbahFormInspeksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IsiInspeksi.this, FormTemuan.class));
            }
        });

        binding.item2positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.detailTemuan.setVisibility(View.GONE);
            }
        });

        binding.item2negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(IsiInspeksi.this, FormTemuan.class), 1);
            }
        });

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IsiInspeksi.this, FotoSesudahInspeksi.class));
            }
        });
    }

    private void setDropdown() {
        String[] isian = new String [] {"test3","test4","test5"};
        ArrayAdapter<String> isianAdapter = new ArrayAdapter<>(this, R.layout.dropdown_list, isian);
        binding.listPilihan.setAdapter(isianAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            switch (requestCode) {
                case 1:
                    binding.detailTemuan.setVisibility(View.VISIBLE);
            }
        }
    }
}
