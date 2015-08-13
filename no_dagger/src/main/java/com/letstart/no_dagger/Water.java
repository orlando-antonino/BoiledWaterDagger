package com.letstart.no_dagger;

import android.util.Log;

/**
 * Created by antonino.orlando on 13/08/2015.
 */
public class Water {
    private final String TAG = Water.class.getSimpleName();

    int id =0;
    public Water(int id){
        this.id=id;
    }
    public void pour(){
        Log.i(TAG, "... poured ... "+id);
    }

}
