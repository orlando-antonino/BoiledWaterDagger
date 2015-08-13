package com.letstart.dagger2me;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by antonino.orlando on 13/08/2015.
 */
@Module
public class BoilerModule {
    BoiledWaterApplication boiledWaterApplication;

    public BoilerModule(BoiledWaterApplication teaApp){
        this.boiledWaterApplication = teaApp;
    }
    @Provides @Singleton
    public Boiler provideBoiler(){

        return new Boiler();
    }
}
