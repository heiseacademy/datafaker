package com.github.sparsick.heise.datafaker;

import org.junit.jupiter.api.Test;

public class DataTest {

    @Test
    void objectMother() {
        var person = PersonObjectMother.newPerson();
    }

    @Test
    void builder(){
        var person = new PersonBuilder()
                .withLastName("Parsick")
                .withFirstName("Sandra")
                .build();
    }

    @Test
    void mixBuilderObjectMother(){
        var person = new PersonBuilder(PersonObjectMother.newPerson())
                .withLastName("Parsick")
                .withFirstName("Sandra")
                .build();
    }

}
