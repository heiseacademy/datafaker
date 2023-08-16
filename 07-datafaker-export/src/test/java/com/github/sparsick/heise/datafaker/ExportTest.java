package com.github.sparsick.heise.datafaker;

import net.datafaker.Faker;
import net.datafaker.transformations.Field;
import net.datafaker.transformations.JavaObjectTransformer;
import net.datafaker.transformations.JsonTransformer;
import net.datafaker.transformations.Schema;
import net.datafaker.transformations.sql.SqlDialect;
import net.datafaker.transformations.sql.SqlTransformer;
import org.junit.jupiter.api.Test;

public class ExportTest {

    @Test
    void exportJson() {
        Faker faker = new Faker();
        Schema<Object, ?> schema = Schema.of(
                Field.field("hero", () -> faker.dcComics().hero()),
                Field.field("heroine", () -> faker.dcComics().heroine())
        );

        JsonTransformer<Object> transformer = JsonTransformer.builder().build();
        String json = transformer.generate(schema, 5);

        System.out.println(json);
    }

    @Test
    void exportSql() {
        Faker faker = new Faker();
        Schema<String, String> schema = Schema.of(
                Field.field("hero", () -> faker.dcComics().hero()),
                Field.field("heroine", () -> faker.dcComics().heroine())
        );

        SqlTransformer<String> transformer = SqlTransformer.<String>builder()
                .dialect(SqlDialect.MYSQL)
                .batch(5)
                .tableName("DC_HEROS")
                .build();
        String sql = transformer.generate(schema, 10);

        System.out.println(sql);
    }

    @Test
    void exportJava() {
        Faker faker = new Faker();
        Schema<Object, ?> schema = Schema.of(
                Field.field("hero", () -> faker.dcComics().hero()),
                Field.field("heroine", () -> faker.dcComics().heroine())
        );

        JavaObjectTransformer transformer = new JavaObjectTransformer();

        var object = transformer.apply(DC.class, schema);

        System.out.print(object);


    }

    public static class DC {

        private String hero;
        private String heroine;

        @Override
        public String toString() {
            return "DC{" +
                    "hero='" + hero + '\'' +
                    ", heroine='" + heroine + '\'' +
                    '}';
        }
    }
}
