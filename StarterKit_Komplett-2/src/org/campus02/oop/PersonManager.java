package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons = new ArrayList<>();

    public PersonManager() {
        this.persons = persons;
    }

    public void add (Person p){
       this.persons.add(p);
    }
    public void doAnalysis(PersonAnalyzer a){
        a.setPersons(persons);
        a.analyze();
    }
}
