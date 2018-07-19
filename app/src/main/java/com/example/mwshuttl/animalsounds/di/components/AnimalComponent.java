package com.example.mwshuttl.animalsounds.di.components;

import com.example.mwshuttl.animalsounds.MainActivity;
import com.example.mwshuttl.animalsounds.di.module.AnimalModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AnimalModule.class)
public interface AnimalComponent {

    void inject(MainActivity mainActivity); // specify the injection target for the modules
}
