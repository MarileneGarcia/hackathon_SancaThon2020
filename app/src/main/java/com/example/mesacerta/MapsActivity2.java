package com.example.mesacerta;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String loc = "Sao Paulo, Sao Carlos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        if(params!=null){
            loc = params.getString("mensagem");
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        List<Address> addressList = null;
        Geocoder geocoder = new Geocoder(this);

        try {
            addressList = geocoder.getFromLocationName(loc, 2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < addressList.size(); i++){
            Address userAdress = addressList.get(i);
            LatLng LatLng = new LatLng(userAdress.getLatitude(), userAdress.getLongitude());
            mMap.addMarker(new MarkerOptions().position(LatLng));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(LatLng));

        }
    }
}