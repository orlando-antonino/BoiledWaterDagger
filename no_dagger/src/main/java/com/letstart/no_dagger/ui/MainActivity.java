package com.letstart.no_dagger.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.letstart.no_dagger.BoilerModule;
import com.letstart.no_dagger.R;
import com.letstart.no_dagger.WaterModule;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WaterModule waterM = WaterModule.getInstance();
        BoilerModule boilerM = BoilerModule.getInstance();

        boilerM.boiler.fill();
        Log.i(TAG, "... boiled ... ");
        waterM.water.pour();
    }


}
