package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.cimb.asiikpro.databinding.ActivityKorektifBinding;

public class Korektif extends AppCompatActivity implements BottomsheetByPekerjaan.BottomSheetListener {

    private ActivityKorektifBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityKorektifBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Korektif");

        binding.byPekerjaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomsheetByPekerjaan bottomsheet = new BottomsheetByPekerjaan();
                bottomsheet.show(getSupportFragmentManager(), "byPekerjaan");
            }
        });

    }

    @Override
    public void onButtonClicked(String text) {
        binding.tvByPekerjaan.setText(text);
        binding.byPekerjaan.setStrokeColor(getResources().getColor(R.color.colorAccent));
        binding.byPekerjaan.setCardBackgroundColor(getResources().getColor(R.color.colorAccentTransparent));
//        binding.byPekerjaan.setStrokeWidth(0);
//        binding.tvByPekerjaan.setTextColor(getResources().getColor(R.color.grey7));
    }
}
