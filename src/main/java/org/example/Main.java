package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Grigoriy", "Kovalenko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}