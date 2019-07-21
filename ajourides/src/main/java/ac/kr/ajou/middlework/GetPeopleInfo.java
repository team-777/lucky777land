package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.MerryGoRoundInfo;
import ac.kr.ajou.domain.PersonInfo;
import ac.kr.ajou.domain.PirateShipInfo;
import ac.kr.ajou.domain.ZyroDropInfo;
import lombok.Data;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Data
public class GetPeopleInfo {

    private int maxage;
    private int minage;
    private float maxtall;

    public void PeopleInfo(List<PersonInfo> nowPeopleList, int limitpeoplenumofrides) {


    }

    private void giveInfoToEachPerson(List<PersonInfo> nowPeopleList, int limitpeoplenumofrides, PersonInfo personInfo) {




    }

    private PersonInfo getPersonInfoInMerry(int agegap, Random random) {



    }

    private PersonInfo getPersonInfo(int agegap){



    }

    private void setParamForMerry(MerryGoRoundInfo merryGoRoundInfo) {

    }

    private void setParamForZyro(ZyroDropInfo zyroDropInfo) {

    }

    private void setParamForPirate(PirateShipInfo pirateShipInfo) {

    }

}


