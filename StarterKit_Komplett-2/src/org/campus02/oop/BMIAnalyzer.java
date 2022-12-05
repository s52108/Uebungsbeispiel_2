package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();


    private double calcBMI(Person p)
    {
        int weight = p.getWeight();
        double sizeInMeters = p.getSize() / 100.;

        return weight / (sizeInMeters * sizeInMeters);
    }

    public BMIAnalyzer() {
        this.result = result;
    }

    public void analyze() {
        for(Person p : getPersons())
        {
          double bmi = calcBMI(p);
          result.add(new Pair<>(p,bmi));
            System.out.println(p+" BMI: " + bmi);
        }

    }

}
