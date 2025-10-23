package org.chdtu;

public class University {
    private String name;
    private Person person;

    // DI через конструктор
    public University(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    // setter
    public void setName(String name) { this.name = name; }
    public void setPerson(Person person) { this.person = person; }

    @Override
    public String toString() {
        return "University: " + name + "\n" + person;
    }
}
