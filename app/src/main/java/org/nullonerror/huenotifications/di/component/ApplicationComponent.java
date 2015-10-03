package org.nullonerror.huenotifications.di.component;

import org.nullonerror.huenotifications.activity.MainActivity;
import org.nullonerror.huenotifications.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity activity);
}