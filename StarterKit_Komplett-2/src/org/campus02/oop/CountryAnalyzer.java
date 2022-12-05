package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    public CountryAnalyzer() {
        this.result = result;
    }

    @Override
    public void analyze() {
        //result.clear();
        for(Person p : getPersons())
        {
            Integer currentPersons = result.getOrDefault(p.getCountry(), 0);
            result.put(p.getCountry(), ++currentPersons);
        }
    }
}
