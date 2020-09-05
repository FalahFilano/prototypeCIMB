package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityDetailPekerjaanBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DetailPekerjaan extends AppCompatActivity {
    private ActivityDetailPekerjaanBinding binding;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailPekerjaanBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Pekerjaan");

        final String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());


        if (getIntent().hasExtra("FormSOP")){
            binding.btnIsiForm.setVisibility(View.GONE);
            binding.imageView2.setImageResource(R.drawable.ic_ic_round_check_circle);
            binding.PathSop1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            binding.PathSop2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            binding.tvTglKonfirmasi.setVisibility(View.VISIBLE);
            binding.tvtglSOP.setText("Selesai dilakukan pada " + date);
        }

        binding.btnKonfSPV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btnPilihPekerjaan.setVisibility(View.VISIBLE);
                binding.imageView3.setImageResource(R.drawable.ic_ic_round_check_circle);
                binding.tvTglKonfirmasi.setText("Selesai dilakukan pada " + date);
                binding.PathKonf1.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.PathKonf2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.tvPilihPekerjaan.setVisibility(View.VISIBLE);
            }
        });

        binding.btnIsiForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailPekerjaan.this, FormInspeksi.class);
                //intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
