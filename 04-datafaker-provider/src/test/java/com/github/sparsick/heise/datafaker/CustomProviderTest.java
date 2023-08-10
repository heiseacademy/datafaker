package com.github.sparsick.heise.datafaker;

import org.junit.jupiter.api.Test;

public class CustomProviderTest {

    @Test
    void simpleProvider() {
        CustomizedFaker faker = new CustomizedFaker();
        System.out.println(faker.marvelHeros().nextMarvelHero());

    }

    @Test
    void fileBasedProvider() {
        CustomizedFaker faker = new CustomizedFaker();
        System.out.println(faker.marvel().heroine());
        System.out.println(faker.marvel().hero());

    }
}
