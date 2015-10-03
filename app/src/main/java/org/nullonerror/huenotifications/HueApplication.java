package org.nullonerror.huenotifications;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.HawkBuilder;

import org.nullonerror.huenotifications.di.component.ApplicationComponent;
import org.nullonerror.huenotifications.di.component.DaggerApplicationComponent;
import org.nullonerror.huenotifications.di.module.ApplicationModule;

public class HueApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        Hawk.init(this)
            .setEncryptionMethod(HawkBuilder.EncryptionMethod.NO_ENCRYPTION)
            .setStorage(HawkBuilder.newSqliteStorage(this))
            .build();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }

    public static HueApplication from(@NonNull Context context) {
        return (HueApplication) context.getApplicationContext();
    }
}
