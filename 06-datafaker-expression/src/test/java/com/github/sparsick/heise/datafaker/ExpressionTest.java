package com.github.sparsick.heise.datafaker;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

public class ExpressionTest {


    @Test
    void letterify() {
        Faker faker = new Faker();

        String output = faker.expression("#{letterify 'foo???bar'}");

        System.out.println(output);

        output = faker.expression("#{letterify 'foo???bar', 'true'}");

        System.out.println(output);

        String letterify = faker.letterify("foo???bar", true);
        System.out.println(letterify);
    }

    @Test
    void numerify() {
        Faker faker = new Faker();
        String output = faker.expression("#{numerify 'foo##'}");
//           faker.numerify("foo##")
        System.out.println(output);
    }

    @Test
    void bothify() {
        Faker faker = new Faker();
        String output = faker.expression("#{bothify '?#'}");
//        faker.bothify("?#")
        System.out.println(output);
    }

    @Test
    void templatify(){
        Faker faker = new Faker();
        String output = faker.expression("#{templatify 'foo', 'f', '!', 'F'}");
//        faker.templatify("foo". "f", "!", "F");
        System.out.println(output);
    }

    @Test
    void examplify(){
        Faker faker = new Faker();
        String output = faker.expression("#{examplify 'ABC'}");
        faker.examplify("ABC");
        System.out.println(output);
    }

    @Test
    void regexify(){
        Faker faker = new Faker();
        String output = faker.expression("#{regexify '(a|b){2,3}'}");
//        faker.regexify("(a|b){2,3}");
        System.out.println(output);
    }

    @Test
    void options() {
        Faker faker = new Faker();
        String output = faker.expression("#{options.option 'ABC', 'foo', 'bar'}");
//        faker.options().option("ABC", "foo", "bar");
        System.out.println(output);
    }


}
