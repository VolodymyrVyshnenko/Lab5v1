package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student Bykov = new Student("Bykov", "Alexandr", 18, 9, 12345679);
        Student Vyshnenko = new Student("Vyshnenko", "Volodymyr", 19, 7, 12345678);
        ArrayList persons = new ArrayList();
        persons.add(Vyshnenko);
        persons.add(Bykov);
        for (int i = 0; i< persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}