package org.nullonerror.huenotifications.di.module;

import android.content.Context;

import com.squareup.otto.Bus;

import org.nullonerror.huenotifications.HueApplication;
import org.nullonerror.huenotifications.network.BridgeEndpoint;
import org.nullonerror.huenotifications.network.HueService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

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

    @Provides
    @Singleton
    HueService provideService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(new BridgeEndpoint())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit.create(HueService.class);
    }
}