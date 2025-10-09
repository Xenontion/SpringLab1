package org.chdtu;

public class Cat implements Pet {
    private String name; // 👈 додали поле

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }

    // --- getter/setter для name ---
    public void setName(String name) {
        System.out.println("Class Cat: set name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}
