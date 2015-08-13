package com.letstart.dagger2me.ui;

import android.app.Activity;
import android.os.Bundle;

import com.letstart.dagger2me.BoiledWaterApplication;
import com.letstart.dagger2me.Water;

import javax.inject.Inject;

public class BoiledWActivity extends Activity {
    @Inject
    public Water water;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BoiledWaterApplication) getApplication()).component().inject(this);

        water.pour();
    }


}
