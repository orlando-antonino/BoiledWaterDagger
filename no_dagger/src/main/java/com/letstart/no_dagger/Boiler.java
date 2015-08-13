package com.letstart.no_dagger;

import android.util.Log;

/**
 * Created by antonino.orlando on 13/08/2015.
 */
public class Boiler {
    private final String TAG = Boiler.class.getSimpleName();

    boolean isFilled = false;

    public Boiler(){

    }
    public void fill(){
        isFilled = true;
        Log.i(TAG, "... filling ... " );
    }

}
