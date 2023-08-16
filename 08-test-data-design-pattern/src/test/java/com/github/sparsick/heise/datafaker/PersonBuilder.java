package com.github.sparsick.heise.datafaker;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private String jobTitle;

    public PersonBuilder(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.jobTitle = person.getJobTitle();
    }

    public PersonBuilder() {
    }

    PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    PersonBuilder withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    Person build() {
        var person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setJobTitle(jobTitle);
        return person;
    }
}
