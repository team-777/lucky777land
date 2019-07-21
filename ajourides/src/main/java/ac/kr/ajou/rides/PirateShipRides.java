package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;

public class PirateShipRides {

    public void goOnRides(int pirateshippeople){
        int howmanyrideswillwork = startOfRides(pirateshippeople);
        endOfRides(howmanyrideswillwork);
    }

    public void endOfRides(int manyrideswillwork){
        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(manyrideswillwork,50);
        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

    public int startOfRides(int getpirateshippeople){

        int howmanyrideswillwork = getpirateshippeople/50;

        System.out.println("=======================================");
        System.out.println("our Pirate ship rides work for " + howmanyrideswillwork + " times today");

        return howmanyrideswillwork;
    }

}
