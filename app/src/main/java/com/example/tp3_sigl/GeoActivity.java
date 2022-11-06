package com.example.tp3_sigl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

/*import android.annotation.SuppressLint;
import android.net.Uri;
*/
import android.annotation.SuppressLint;
import android.os.Bundle;


// api_key = AIzaSyCEv3b_IR0pmVhJq_yrlVtGo_R43W99I5I
public class GeoActivity extends AppCompatActivity {

    ConstraintLayout consLayout;
    private MyMapFragment myMapFragment;

    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        this.myMapFragment = (MyMapFragment) fragmentManager.findFragmentById(R.id.fragment_map);


        /*consLayout = (ConstraintLayout) findViewById(R.id.geoLocId);

        consLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

    }
}