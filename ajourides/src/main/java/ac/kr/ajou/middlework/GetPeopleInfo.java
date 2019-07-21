package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.MerryGoRoundInfo;
import ac.kr.ajou.domain.PersonInfo;
import ac.kr.ajou.domain.PirateShipInfo;
import ac.kr.ajou.domain.ZyroDropInfo;
import ac.kr.ajou.entrance.CreatePeople;
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

        MerryGoRoundInfo merryGoRoundInfo = new MerryGoRoundInfo();
        PirateShipInfo pirateShipInfo = new PirateShipInfo();
        ZyroDropInfo zyroDropInfo = new ZyroDropInfo();

        Random random = new Random();
        PersonInfo personInfo;

        if(limitpeoplenumofrides==20) {
            setParamForMerry(merryGoRoundInfo);
            personInfo = getPersonInfoInMerry(this.maxage-this.minage, random);
            nowPeopleList = giveInfoToEachPerson(nowPeopleList, limitpeoplenumofrides, personInfo);
            System.out.println("Merry-Go-Round launch");
            trycatchthetiem(merryGoRoundInfo.getRunningtime());
        }

        else if(limitpeoplenumofrides==40) {
            setParamForZyro(zyroDropInfo);
            personInfo = getPersonInfo(this.maxage-this.minage);
            nowPeopleList = giveInfoToEachPerson(nowPeopleList, limitpeoplenumofrides, personInfo);
            System.out.println("Zyro-Drop launch");
            trycatchthetiem(zyroDropInfo.getRunningtime());

        }
        else {
            setParamForPirate(pirateShipInfo);
            personInfo = getPersonInfo(this.maxage-this.minage);
            nowPeopleList = giveInfoToEachPerson(nowPeopleList, limitpeoplenumofrides, personInfo);
            System.out.println("Pirate Ship launch");
            trycatchthetiem(pirateShipInfo.getRunningtime());
        }

        System.out.println("Thank you for comming and this is the end of our rides here come's the next group!\n");

    }

    private List<PersonInfo> giveInfoToEachPerson(List<PersonInfo> nowPeopleList, int limitpeoplenumofrides, PersonInfo personInfo) {
        for(int peoplenum = 0; peoplenum <limitpeoplenumofrides; peoplenum++) {
            nowPeopleList
                    .set(peoplenum, personInfo);
        }
        return nowPeopleList;
    }

    private PersonInfo getPersonInfoInMerry(int agegap, Random random) {
        return new PersonInfo((int)(Math.random()*100+ this.maxtall),(int)((Math.random()*100)%agegap+ this.minage),random.nextBoolean());
    }

    private PersonInfo getPersonInfo(int agegap){
        return new PersonInfo((int)(Math.random()*100+ this.maxtall),(int)((Math.random()*100)%agegap+ this.minage),false);
    }

    private void setParamForMerry(MerryGoRoundInfo merryGoRoundInfo) {
        setMaxage(merryGoRoundInfo.getMaxage());
        setMinage(merryGoRoundInfo.getMinage());
        setMaxtall(merryGoRoundInfo.getMaxtall());
    }

    private void setParamForZyro(ZyroDropInfo zyroDropInfo) {
        setMaxage(zyroDropInfo.getMaxage());
        setMinage(zyroDropInfo.getMinage());
        setMaxtall(zyroDropInfo.getMaxtall());
    }

    private void setParamForPirate(PirateShipInfo pirateShipInfo) {
        setMaxage(pirateShipInfo.getMaxage());
        setMinage(pirateShipInfo.getMinage());
        setMaxtall(pirateShipInfo.getMaxtall());
    }

    public void trycatchthetiem(int runningtime){
        try {
            TimeUnit.MILLISECONDS.sleep(runningtime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}