package com.company;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone(665542,"nokia",50);
        Phone p2 = new Phone(554488,"motorola",40);
        Phone p3 = new Phone(778899,"Iphone",30.45);
        System.out.println("Номер "+p1.getNumber()+", модель "+p1.getModel()+", вес "+p1.getWeight());
        System.out.println("Номер "+p2.getNumber()+", модель "+p2.getModel()+", вес "+p2.getWeight());
        System.out.println("Номер "+p3.getNumber()+", модель "+p3.getModel()+", вес "+p3.getWeight());

        p1.receiveCall("Vova");
        p2.receiveCall("lina");
        p3.receiveCall("Inna");

        p1.receiveCall("Vova",547895);
        p2.receiveCall("lina",547896);
        p3.receiveCall("Inna",235698);

        p1.sendMessage(123454,125896,124578,12563,784578);


    }
}