package org.campus02.oop;

import java.util.ArrayList;

public class MaxSalaryAnalyzer extends PersonAnalyzer{
    public MaxSalaryAnalyzer() {
    }

    @Override
    public void analyze() {

        int maxSalary = 0;
        ArrayList<Person> personsWithMaxSalary = new ArrayList<>();

        for(Person p : getPersons())
        {
            if(p.getSalary() > maxSalary)
            {
                personsWithMaxSalary.clear();
                maxSalary = p.getSalary();
                personsWithMaxSalary.add(p);
            }
            else if(p.getSalary() == maxSalary)
                personsWithMaxSalary.add(p);
        }

        for(Person p : personsWithMaxSalary)
        {
            System.out.println(p);
        }
    }

}
