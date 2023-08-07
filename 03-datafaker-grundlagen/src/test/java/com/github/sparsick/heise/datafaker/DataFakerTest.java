package com.github.sparsick.heise.datafaker;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class DataFakerTest {

    @Test
    void datafakerbasic() {
        Faker faker = new Faker();

        var person = new Person();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setJobTitle(faker.job().title());

        System.out.println(person);

    }

    @Test
    void datafakerlocal() {
        Faker faker = new Faker(Locale.GERMAN);

        var person = new Person();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        String jobTitle = faker.job().title();
        person.setJobTitle(jobTitle);

        assertThat(person.getJobTitle()).isEqualTo(jobTitle);
    }




}
