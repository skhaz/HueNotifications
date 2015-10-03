package org.nullonerror.huenotifications.di.module;

import android.content.Context;

import com.squareup.otto.Bus;

import org.nullonerror.huenotifications.HueApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final HueApplication application;

    public ApplicationModule(HueApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    Bus provideBus() {
        return new Bus();
    }
}