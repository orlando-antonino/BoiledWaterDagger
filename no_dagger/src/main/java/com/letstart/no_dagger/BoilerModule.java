package com.letstart.no_dagger;

import java.util.Random;

/**
 * Created by antonino.orlando on 13/08/2015.
 */

public class BoilerModule {

    private static BoilerModule bmodule = null;
    public Boiler boiler = null;

    private BoilerModule(){
        Random rand = new Random();
         boiler = new Boiler();
    }

    public static BoilerModule getInstance(){
        if (bmodule==null){
            bmodule = new BoilerModule();
        }
        return bmodule;
    }

}
