package de.telran;

public class Main {
    public static void main(String[] args) {

        Module1Lecture1Person person1 = new Module1Lecture1Person();
        person1.move();
        person1.talk();


        Module1Lecture1Person person2 = new Module1Lecture1Person("John", 30);
        person2.move();
        person2.talk();


        Phone phone1 = new Phone("123-258", "iPhone", 150);
        Phone phone2 = new Phone("456-368", "Samsung", 160);
        Phone phone3 = new Phone("789-369", "Nokia", 140);


        System.out.println("Phone 1: Number = " + phone1.number + ", Model = " + phone1.model + ", Weight = " + phone1.weight);
        System.out.println("Phone 2: Number = " + phone2.number + ", Model = " + phone2.model + ", Weight = " + phone2.weight);
        System.out.println("Phone 3: Number = " + phone3.number + ", Model = " + phone3.model + ", Weight = " + phone3.weight);



        phone1.receiveCall("John");
        System.out.println("Phone 1 number: " + phone1.getNumber());

        phone2.receiveCall("Jack");
        System.out.println("Phone 2 number: " + phone2.getNumber());

        phone3.receiveCall("Lucy");
        System.out.println("Phone 3 number: " + phone3.getNumber());
   }
}