package org.chdtu;

public class Person {
    private Pet pet;
    private String name;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    // DI через конструктор
    public Person(Pet pet) {
        System.out.println("Person bean is created with Pet");
        this.pet = pet;
    }

    // setter для Pet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

    // --- name ---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    // --- surname ---
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    // --- age ---
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', surname='" + surname + "', age=" + age + ", pet=" + pet + "}";
    }
}
