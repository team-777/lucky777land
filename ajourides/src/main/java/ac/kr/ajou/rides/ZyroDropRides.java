package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;

public class ZyroDropRides {

    public void goOnRides(int zyrodroppeople){
        int howmanyrideswillwork = startOfRides(zyrodroppeople);
        endOfRides(howmanyrideswillwork);
    }

    public void endOfRides(int manyrideswillwork){
        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(manyrideswillwork, 40);
        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

    public int startOfRides(int getzyrocroppeople){

        int howmanyrideswillwork = getzyrocroppeople/40;

        System.out.println("================================");
        System.out.println("our Zyro-Drop rides work for " + howmanyrideswillwork + " times today");

        return howmanyrideswillwork;
    }

}