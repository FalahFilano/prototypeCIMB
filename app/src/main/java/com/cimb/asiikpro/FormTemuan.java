package com.cimb.asiikpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.cimb.asiikpro.databinding.ActivityFormTemuanBinding;

public class FormTemuan extends AppCompatActivity {

    private ActivityFormTemuanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFormTemuanBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Form Temuan");

        setDropdown();

    }

    private void setDropdown() {

        String[] isian = new String [] {"Anjuran 1","Anjuran 2","Anjuran 3"};
        ArrayAdapter<String> isianAdapter = new ArrayAdapter<>(this, R.layout.dropdown_list, isian);
        binding.listPilihanAnjuran.setAdapter(isianAdapter);
    }
}
