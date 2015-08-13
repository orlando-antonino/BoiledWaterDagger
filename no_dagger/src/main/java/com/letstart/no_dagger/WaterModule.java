package com.letstart.no_dagger;

import java.util.Random;

/**
 * Created by antonino.orlando on 13/08/2015.
 */

public class WaterModule {

    private static WaterModule wmodule = null;
    public Water water = null;

    private WaterModule(){
        Random rand = new Random();
         water = new Water(rand.nextInt((10 - 0) + 1) + 0);
    }

    public static WaterModule getInstance(){
        if (wmodule==null){
            wmodule = new WaterModule();
        }
        return wmodule;
    }

}
