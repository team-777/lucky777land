package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;

public class MerryGoRoundRides {

    public void goOnRides(int merrygoroundpeople){
        int howmanyrideswillwork = startOfRides(merrygoroundpeople);
        endOfRides(howmanyrideswillwork);
    }

    public void endOfRides(int manyrideswillwork){

        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(manyrideswillwork, 20);
        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

    public int startOfRides(int getmerrygoroundpeople) {

        int howmanyrideswillwork = getmerrygoroundpeople/20;

        System.out.println("=======================================");
        System.out.println("our Merry-go-round rides work for " + howmanyrideswillwork + " times today");

        return howmanyrideswillwork;

    }

}