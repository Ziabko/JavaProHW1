package de.telran;

public class Module1Lecture1Person {

    String fullName;
    int age;

    public void move(){
        System.out.println(fullName + " говорит");
    }

    public void talk(){
        System.out.println(fullName +  " двигается");

    }

    public Module1Lecture1Person() {
        fullName = "Неизвестный";
        age = 0;
    }

    public Module1Lecture1Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
