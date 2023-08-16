package com.github.sparsick.heise.datafaker;

public class PersonObjectMother {

    static Person newPerson() {
        return new Person("Sandra", "Parsick", "Software Developer");
    }

    static Person newPersonWithoutJobTitle() {
        return new Person("Sandra", "Parsick");
    }
}
