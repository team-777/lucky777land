package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.PersonInfo;

import java.util.ArrayList;
import java.util.List;

public class PeopleIntoGroups{

    public void IntoGroups(int howmanyrideswillwork, int limitNumOfEachRides) {
        GetPeopleInfo getPeopleInfo = new GetPeopleInfo();

        for(int ridesnum = 0; ridesnum < howmanyrideswillwork; ridesnum++){
            List<PersonInfo> peopleList = new ArrayList<>();
            for(int createlist = 0; createlist<limitNumOfEachRides; createlist++){
                peopleList.add(null);
            }
            getPeopleInfo.PeopleInfo(peopleList.subList(0,limitNumOfEachRides), limitNumOfEachRides);
        }
    }
}
