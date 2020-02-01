package com.example.google1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class photo_page extends AppCompatActivity {
    Button b,pic,tensor,email;
    TextView ro_address;
    TextView ro_gps_location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_page);
        b=findViewById(R.id.location_button);
        pic=findViewById(R.id.photo_button);
        ro_address = findViewById(R.id.address);
        ro_gps_location = findViewById(R.id.location);
       // email=findViewById(R.id.bt_send);
        tensor = findViewById(R.id.model);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(photo_page.this,gallery.class);
                startActivity(intent);
            }
        });

        tensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (photo_page.this,com.example.google1.ChooseModel.class);
                startActivity(intent);
            }
        });



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(photo_page.this,location.class);
                startActivity(intent);

                //Toast.makeText(photo_page.this,"We have done it",Toast.LENGTH_SHORT).show();
              //  LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
                //if (ActivityCompat.checkSelfPermission(photo_page.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(photo_page.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                //}
                /*locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 0, (LocationListener) photo_page.this);

                Criteria criteria = new Criteria();

                Toast.makeText(photo_page.this,"8969876",Toast.LENGTH_SHORT).show();

                String bestProvider = locationManager.getBestProvider(criteria, true);


                if (location == null) {
                    Toast.makeText(getApplicationContext(), "GPS signal not found", Toast.LENGTH_SHORT).show();
                }

                if (location != null) {
                    Log.e("locatin", "location--" + location);

                    Log.e("latitude at beginning",
                            "@@@@@@@@@@@@@@@" + location.getLatitude());
                    onLocationChanged(location);
                }*/
            }

           /* private void onLocationChanged(Location location) {

                Geocoder geocoder;
                List<Address> addresses;
                geocoder = new Geocoder(photo_page.this, Locale.getDefault());

                double latitude = location.getLatitude();
                double longitude = location.getLongitude();

                Log.e("latitude", "latitude--" + latitude);
                try {
                    Log.e("latitude", "inside latitude--" + latitude);
                    addresses = geocoder.getFromLocation(latitude, longitude, 1);
                    if (addresses != null && addresses.size() > 0) {
                        String address = addresses.get(0).getAddressLine(0);
                        String city = addresses.get(0).getLocality();
                        String state = addresses.get(0).getAdminArea();
                        String country = addresses.get(0).getCountryName();
                        String postalCode = addresses.get(0).getPostalCode();
                        String knownName = addresses.get(0).getFeatureName();



                        ro_gps_location.setText(state + " , " + city + " , " + country);
                        ro_address.setText(address + " , " + knownName + " , " + postalCode);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }*/
        });

    }
}
