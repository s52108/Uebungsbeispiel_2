package org.campus02.social;

import java.util.ArrayList;

public class DemoSN {

	public static void main(String[] args) {
		
		SocialNetwork sn = SocialNetwork.generateDemoNetwork();
		
		//TODO 1: geben Sie alle User des Social Networks basierend
		//auf Ihrer geschriebenen .toString() Methode aus

		//System.out.println(sn.getUsers());






	
		//TODO 2: probieren Sie die implementierte rekursive Methode
		//der Klasse SocialNetwork für verschiedene Benutzer und
		//Werte für maxDepth aus.

	for(User u : sn.getUsers()) {
		System.out.println(u);
	}

            System.out.println("\n\n Test findAllFriends(Franz, 1, 2)");
	User franz = getUser(sn, "Franz");
	ArrayList<User> friendsOfFranz = sn.findAllFriends(franz, 1, 2);
	printUsers(friendsOfFranz);

            System.out.println("\n\n Test findAllFriends(Franz, 1, 0)");
	friendsOfFranz = sn.findAllFriends(franz, 1, 0);
	printUsers(friendsOfFranz); //expected: 2 friends (Susi, Fritz)


            System.out.println("\n\n*** Test findAllFriends(Doris, 1, 1)");
	User doris = getUser(sn, "Doris");
	ArrayList<User> friendsOfDoris = sn.findAllFriends(doris, 1, 1);
	printUsers(friendsOfDoris); //expected: 7 (Franz, Peter, Fritz).

	ArrayList<User> allFriends = new ArrayList<>();
            System.out.println(sn.findAllFriends(sn.getUsers().get(0), 0,3));

}

	private static User getUser(SocialNetwork sn, String userName)
	{
		for(User u : sn.getUsers())
		{
			if(u.getName().equals(userName))
				return u;
		}

		return null;
	}

	private static void printUsers(ArrayList<User> users)
	{
		for(User u : users)
		{
			System.out.println(u);
		}
	}


}


