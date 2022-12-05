package org.campus02.oop;

import java.util.HashMap;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		for (int i = 0; i < 100; i++) {
			pm.add(createTestPerson());
		}

		System.out.println("GenderAnalyzer");
		GenderAnalyzer ga = new GenderAnalyzer();
		pm.doAnalysis(ga);

		System.out.println("CountryAnalyzer");
		CountryAnalyzer ca = new CountryAnalyzer();
		pm.doAnalysis(ca);
		HashMap<String,Integer> personsPerCountry = ca.getResult();
		for(String country : personsPerCountry.keySet())
		{
			System.out.println("Land: " + country + ", Anzahl Personen: " + personsPerCountry.get(country));
		}

		System.out.println();
		MaxSalaryAnalyzer msa = new MaxSalaryAnalyzer();
		pm.doAnalysis(msa);

		System.out.println("BMICalculator");
		BMIAnalyzer bmi = new BMIAnalyzer();
		pm.doAnalysis(bmi);

		Person mistake = new Person("John", "Muster", 'M', 25, "AT",12342,"rot",92,185);
		System.out.println("mistake Eye Colour = " + mistake.getEyeColor());


	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "gr�n", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
