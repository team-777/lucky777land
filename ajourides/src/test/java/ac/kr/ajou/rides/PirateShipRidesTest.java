package ac.kr.ajou.rides;

import ac.kr.ajou.domain.PeopleForEachRides;
import ac.kr.ajou.entrance.CreatePeople;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.internal.matchers.Null;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PirateShipRidesTest {
    @Mock
    private PirateShipRides pirateShipRides;


    @Test(expected = NullPointerException.class)
    public void 해적선의_진행횟수가_1이상인지_Test() {
        assertTrue(pirateShipRides.startOfRides(20)>0);
        assertFalse(pirateShipRides.startOfRides(10)>0);

    }



    @Test
    public void 해적선의_진행횟수가_11미만인지_Test(){
        PirateShipRides pirateShipRides = new PirateShipRides();
        CreatePeople createPeople = new CreatePeople();
        int temp = 0;
        PeopleForEachRides peopleForEachRides = new PeopleForEachRides();
        peopleForEachRides = createPeople.getPeopleForEachRides(createPeople.todaysPeopleNum(temp));

        assertTrue( pirateShipRides.startOfRides(peopleForEachRides.getPirateShipPeople()) <11);
    }


}


