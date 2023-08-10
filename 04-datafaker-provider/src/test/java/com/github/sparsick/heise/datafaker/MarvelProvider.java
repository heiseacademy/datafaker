package com.github.sparsick.heise.datafaker;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

public class MarvelProvider extends AbstractProvider<BaseProviders> {
    protected MarvelProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get("src/test/resources/marvel-hero.yml"));
        faker.addPath(Locale.ENGLISH, Paths.get("src/test/resources/marvel-heroine.yml"));
    }

    public String hero() {
        return resolve("marvel.hero");
    }

    public String heroine() {
        return resolve("marvel.heroine");
    }
}
