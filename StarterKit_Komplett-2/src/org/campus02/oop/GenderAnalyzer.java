package org.campus02.oop;

import java.util.ArrayList;

public class GenderAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {

        int sizeMale = 0;
        int sizeFemale = 0;
        int countMale = 0;
        int countFemale = 0;
        int averageSizeMale = 0;
        int averageSizeFemale = 0;


        for(Person p : getPersons())
        {
            if(p.getGender()=='M')
            {
                sizeMale += p.getSize();
                countMale++;
            }
            else
            {
                sizeFemale += p.getSize();
                countFemale++;
            }


        }

        averageSizeMale = (sizeMale / countMale);
        averageSizeFemale = (sizeFemale / countFemale);

        System.out.println("In der Liste existieren " + countMale + " Männer mit einer durchschnittlichen Körpergröße von " + averageSizeMale + " cm");
        System.out.println("In der Liste existieren " + countFemale + " Männer mit einer durchschnittlichen Körpergröße von " + averageSizeFemale + " cm");
    }
}
