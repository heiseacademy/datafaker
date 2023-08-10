package com.github.sparsick.heise.datafaker;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

public class MarvelHardcodedProvider extends AbstractProvider<BaseProviders> {
    private static final String[] MARVEL_HEROS_NAMES = new String[] {"Thor", "Captain Marvel"};

    protected MarvelHardcodedProvider(BaseProviders faker) {
        super(faker);
    }

    public String nextMarvelHero() {
        return MARVEL_HEROS_NAMES[faker.random().nextInt(MARVEL_HEROS_NAMES.length)];
    }
}
