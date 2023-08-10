package com.github.sparsick.heise.datafaker;

import net.datafaker.Faker;

public class CustomizedFaker extends Faker {
    public MarvelHardcodedProvider marvelHeros(){
        return getProvider(MarvelHardcodedProvider.class, MarvelHardcodedProvider::new, this);
    }

    public MarvelProvider marvel(){
        return getProvider(MarvelProvider.class, MarvelProvider::new, this);
    }
}
