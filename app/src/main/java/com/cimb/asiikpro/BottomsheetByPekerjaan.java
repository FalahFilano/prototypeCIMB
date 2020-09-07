package com.cimb.asiikpro;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomsheetByPekerjaan extends BottomSheetDialogFragment {

    private BottomsheetByPekerjaan.BottomSheetListener bottomSheetListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottomsheet_bypekerjaan, container, false);

        final TextView tv1 = v.findViewById(R.id.tvPekerjaan1);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetListener.onButtonClicked(tv1.getText().toString());
                dismiss();
            }
        });

        return v;
    }

    public interface BottomSheetListener {
        void onButtonClicked(String text);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            bottomSheetListener = (BottomsheetByPekerjaan.BottomSheetListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()
                    + " musl implement bottomsheetlistener");
        }
    }
}
