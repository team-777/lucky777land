package ac.kr.ajou.entrance;

import ac.kr.ajou.domain.PeopleForEachRides;
import ac.kr.ajou.rides.MerryGoRoundRides;
import ac.kr.ajou.rides.PirateShipRides;
import ac.kr.ajou.rides.ZyroDropRides;

public class CreatePeople{

    public int random;

    public int todaysPeopleNum(int TodaysTotalVisit) {

        random = 1 + (int)(Math.random()*100)%4;
        TodaysTotalVisit = 110+ 110* random;
        return TodaysTotalVisit;
    }

    public void chooseRides(int TodaysVisit_for_Rides){

        PeopleForEachRides peopleForEachRides = getPeopleForEachRides(TodaysVisit_for_Rides);

        seeEachPeopleNum(peopleForEachRides.getMerryGoRoundPeople(), " people wants to ride on Merry-Go-Round");
        seeEachPeopleNum(peopleForEachRides.getPirateShipPeople(), " people wants to ride on Pirate Ship");
        seeEachPeopleNum(peopleForEachRides.getZyroDropPeople(), " people wants to ride on Zyro-Drop");

        startRides(peopleForEachRides);

    }


    private PeopleForEachRides getPeopleForEachRides(int TodaysVisit_for_Rides) {
        PeopleForEachRides peopleForEachRides = new PeopleForEachRides();
        peopleForEachRides.setMerryGoRoundPeople(20 + (((int)(Math.random()*100)%random)*20));
        peopleForEachRides.setZyroDropPeople(50 + (((int)(Math.random()*100)%random)*50));
        peopleForEachRides.setPirateShipPeople(
                TodaysVisit_for_Rides
                        - peopleForEachRides.getMerryGoRoundPeople()
                        - peopleForEachRides.getZyroDropPeople());
        return peopleForEachRides;

    }

    private void startRides(PeopleForEachRides peopleForEachRides) {
        MerryGoRoundRides merryGoRoundRides  = new MerryGoRoundRides();
        PirateShipRides pirateShipRides = new PirateShipRides();
        ZyroDropRides zyroDropRides = new ZyroDropRides();

        merryGoRoundRides.goOnRides(peopleForEachRides.getMerryGoRoundPeople());
        pirateShipRides.goOnRides(peopleForEachRides.getPirateShipPeople());
        zyroDropRides.goOnRides(peopleForEachRides.getZyroDropPeople());

    }

    private void seeEachPeopleNum(int merryGoRoundPeople, String s) {
        System.out.println(merryGoRoundPeople + s);
    }


}