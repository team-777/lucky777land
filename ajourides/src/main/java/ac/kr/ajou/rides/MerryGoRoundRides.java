package ac.kr.ajou.rides;

import ac.kr.ajou.middlework.PeopleIntoGroups;


public class MerryGoRoundRides {

    public void startOfRides(int getmerrygoroundpeople) {

        int howmanyrideswillwork = getmerrygoroundpeople/20;

        System.out.println("=======================================");
        System.out.println("our Merry-go-round rides work for " + howmanyrideswillwork + " times today");

        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        peopleIntoGroups.IntoGroups(howmanyrideswillwork, 20);

        System.out.println("okay there are no groups waiting anymore. see you next time!");

    }

}

