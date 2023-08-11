package com.github.sparsick.heise.datafaker;

import net.datafaker.Faker;
import net.datafaker.sequence.FakeSequence;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class FakeSequenceTest {

    @Test
    void sequenceTest() {
        Faker faker = new Faker();

        List<String> names = faker.collection(
                () -> faker.dcComics().hero(),
                () -> faker.funnyName().name()
        ).len(5).generate();
    }

    @Test
    void randomTypSequence() {
        Faker faker = new Faker();

        List<Object> randomList = faker.<Object>collection(
                () -> faker.dcComics().hero(),
                () -> faker.random().nextInt(100)
        ).len(5).generate();
    }

    @Test
    void sequenceWithNull() {
        Faker faker = new Faker();

        List<Object> randomList = faker.<Object>collection(
                () -> faker.dcComics().hero(),
                () -> faker.random().nextInt(100)
        ).nullRate(0.3).len(5).generate();
    }

    @Test
    void sequenceAsStreamTest() {
        Faker faker = new Faker();

        Stream<String> names = faker.stream(
                () -> faker.dcComics().hero(),
                () -> faker.funnyName().name()
        ).len(5).generate();
    }

    @Test
    void infinitySequence() {
        Faker faker = new Faker();

        FakeSequence<String> infiniteNameStream = faker.stream(
                () -> faker.dcComics().hero(),
                () -> faker.funnyName().name()
        ).build();

        infiniteNameStream.isInfinite(); // true
    }

    @Test
    void finitySequence() {
        Faker faker = new Faker();

        FakeSequence<String> infiniteNameStream = faker.collection(
                () -> faker.dcComics().hero(),
                () -> faker.funnyName().name()
        ).build();

        infiniteNameStream.isInfinite(); // false
    }



}
