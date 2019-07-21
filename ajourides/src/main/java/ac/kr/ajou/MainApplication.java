package ac.kr.ajou;

import ac.kr.ajou.entrance.CreatePeople;


public class MainApplication {

    public static int TodaysTotalVisit;
    public static void main(String[] args){

        System.out.println("WELCOME TO LUCKY777LAND");
        CreatePeople createPeople = new CreatePeople();
        TodaysTotalVisit = createPeople.todaysPeopleNum(TodaysTotalVisit);
        System.out.println(TodaysTotalVisit + " people entering...");

        createPeople.chooseRides(TodaysTotalVisit);

    }
}