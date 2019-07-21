package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.PersonInfo;

import java.util.ArrayList;
import java.util.List;

public class PeopleIntoGroups{

    public List<PersonInfo> GroupsIntoNull(List<PersonInfo> peopleListed, int limit){
        for(int createlist = 0; createlist<limit; createlist++){
            peopleListed.add(null);
        }
        return peopleListed;
    }
    public void IntoGroups(int howmanyrideswillwork, int limitNumOfEachRides) {

        GetPeopleInfo getPeopleInfo = new GetPeopleInfo();

        for(int ridesnum = 0; ridesnum < howmanyrideswillwork; ridesnum++){
            List<PersonInfo> peopleList = new ArrayList<>();
            peopleList = GroupsIntoNull(peopleList,limitNumOfEachRides);

            getPeopleInfo.PeopleInfo(peopleList.subList(0,limitNumOfEachRides), limitNumOfEachRides);
        }
    }
}