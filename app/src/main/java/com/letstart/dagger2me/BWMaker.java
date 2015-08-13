package com.letstart.dagger2me;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by antonino.orlando on 13/08/2015.
 */

public class BWMaker {

    private final String TAG = BWMaker.class.getSimpleName();

    Water water;
    Boiler boiler;

    boolean boiled = false;
    @Inject
    BWMaker(Water water, Boiler boiler){
        this.boiler = boiler;
        this.water = water;
    }
    public void build(){
        boiler.fill();

        boiled = true;
        Log.i(TAG, "... boiled ... ");
        water.pour();
    }
}
