package com.letstart.dagger2me;

import android.util.Log;

/**
 * Created by antonino.orlando on 13/08/2015.
 */
public class Boiler {
    private final String TAG = Boiler.class.getSimpleName();

    boolean filled = false;
    public Boiler(){

    }
    public void fill(){
        this.filled = true;
        Log.i(TAG, "... filled ... ");
    }
    public boolean isFilled(){
        return this.filled;
    }

}
