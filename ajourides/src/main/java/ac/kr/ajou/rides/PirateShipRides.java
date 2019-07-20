package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;

public class PirateShipRides {

    public void StartOfRides(int getpirateshippeople){

        int howmanyrideswillwork = getpirateshippeople/50;

        System.out.println("=======================================");
        System.out.println("our Pirate ship rides work for " + howmanyrideswillwork + " times today");

        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(howmanyrideswillwork, 50);

        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

}

