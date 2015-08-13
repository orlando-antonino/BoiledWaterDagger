package com.letstart.dagger2me;

import android.app.Application;

import com.letstart.dagger2me.ui.BoiledWActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by antonino.orlando on 13/08/2015.
 */

public class BoiledWaterApplication extends Application {

    @Singleton
    @Component(modules = {
        WaterModule.class,
        BoilerModule.class})
    public interface BoiledWaterComponent{
        void inject(BoiledWaterApplication teaApp);
        void inject(BoiledWActivity mainAct);
        BWMaker make();
    }


    @Inject Water water;

    private BoiledWaterComponent component;

    @Override
    public void onCreate(){
        super.onCreate();


        component = DaggerBoiledWaterApplication_BoiledWaterComponent.builder()
                .waterModule(new WaterModule(this))
                .boilerModule(new BoilerModule(this))
                .build();

        component.inject(this);

        component.make().build();

        water.pour();

    }

    public BoiledWaterComponent component() {
        return component;
    }
}
