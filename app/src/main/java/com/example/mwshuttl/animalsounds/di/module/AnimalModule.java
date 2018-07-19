package com.example.mwshuttl.animalsounds.di.module;

import com.example.mwshuttl.animalsounds.soundbox.Dog;
import com.example.mwshuttl.animalsounds.soundbox.FrenchDog;

import dagger.Module;
import dagger.Provides;

@Module
public class AnimalModule {

    @Provides
    public static Dog getDog() {
        return new FrenchDog(); // Change different implementations
        // return new JapaneseDog();
        // return new EnglishDog();
        // return new KoreanDog();
        // return new RussianDog();
    }

}
