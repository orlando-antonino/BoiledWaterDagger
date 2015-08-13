package com.letstart.dagger2me;

import java.util.Random;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by antonino.orlando on 13/08/2015.
 */
@Module
public class WaterModule {
    BoiledWaterApplication boiledWaterApplication;

    public WaterModule(BoiledWaterApplication teaApp){
        this.boiledWaterApplication = teaApp;
    }
    @Provides @Singleton
    public Water provideWater(){

        Random rand = new Random();
        return new Water(rand.nextInt((10 - 0) + 1) + 0);
    }
}
