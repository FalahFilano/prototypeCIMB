package com.cimb.asiikpro;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class SelecAsset extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, BottomsheetAsset.BottomSheetListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selec_asset);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        Marker mSydney = mMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
        mSydney.setTag("Sydney");

        mMap.setOnMarkerClickListener(this);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        String tag = (String) marker.getTag();

        BottomsheetAsset bottomsheet = new BottomsheetAsset();
        bottomsheet.show(getSupportFragmentManager(), "asset");

//        Toast.makeText(this, tag + " was clicked.", Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    public void onButtonClicked(String text) {

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SelecAsset.this, FormInspeksi.class));

    }
}
