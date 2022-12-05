package org.campus02.oop;

import java.util.ArrayList;

public class PersonAnalyzer {
    private ArrayList<Person> persons = new ArrayList<>() ;




    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void analyze(){
        super.getClass() ;
    }
}
