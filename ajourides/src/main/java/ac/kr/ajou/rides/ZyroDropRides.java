package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;

public class ZyroDropRides {

    public void StartOfRides(int getzyrocroppeople){

        int howmanyrideswillwork = getzyrocroppeople/40;

        System.out.println("================================");
        System.out.println("our Zyro-Drop rides work for " + howmanyrideswillwork + " times today");

        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(howmanyrideswillwork, 40);

        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

}

