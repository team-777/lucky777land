package ac.kr.ajou.rides;

import ac.kr.ajou.domain.PeopleForEachRides;
import ac.kr.ajou.entrance.CreatePeople;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ZyroDropRidesTest {



    @Mock
    private ZyroDropRides zyroDropRides;

    @Test(expected = NullPointerException.class)
    public void 자이로드롭의_진행횟수가_1이상인지_Test() {
        assertTrue(zyroDropRides.startOfRides(20)>0);
        assertFalse(zyroDropRides.startOfRides(10)>0);

    }



    @Test
    public void 자이로드롭의_진행횟수가_4이하인지_Test(){

        ZyroDropRides zyroDropRides = new ZyroDropRides();
        CreatePeople createPeople = new CreatePeople();
        int temp = 0;
        PeopleForEachRides peopleForEachRides = new PeopleForEachRides();
        peopleForEachRides = createPeople.getPeopleForEachRides(createPeople.todaysPeopleNum(temp));

        assertTrue( zyroDropRides.startOfRides(peopleForEachRides.getZyroDropPeople()) <11);
    }


}
