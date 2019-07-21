package ac.kr.ajou.rides;


import ac.kr.ajou.MainApplication;
import ac.kr.ajou.domain.MerryGoRoundInfo;
import ac.kr.ajou.domain.PeopleForEachRides;
import ac.kr.ajou.entrance.CreatePeople;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MerryGoRoundRidesTest {

    @Mock
    private MerryGoRoundRides merryGoRoundRides;



    @Test
    public void 회전목마의_진행횟수가_0이상인지_Test() {
        assertTrue(merryGoRoundRides.startOfRides(20)>0);
        assertFalse(merryGoRoundRides.startOfRides(10)>0);

    }


    @Test
    public void startofrides_4이하_문제(){
        MerryGoRoundRides merryGoRoundRides = new MerryGoRoundRides();
        CreatePeople createPeople = new CreatePeople();
        int temp = 0;
        PeopleForEachRides peopleForEachRides = new PeopleForEachRides();
        peopleForEachRides = createPeople.getPeopleForEachRides(createPeople.todaysPeopleNum(temp));
        assertTrue( merryGoRoundRides.startOfRides(peopleForEachRides.getMerryGoRoundPeople()) <=4);
    }




}
