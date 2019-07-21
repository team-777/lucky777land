package ac.kr.ajou;

import ac.kr.ajou.domain.PeopleForEachRides;
import ac.kr.ajou.entrance.CreatePeople;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MainApplicationTest {

    @Mock
    CreatePeople createPeople;

    private int todaysTotalVisit;

    @Test   //김성규
    public void todaysPeopleNumTest_verify_the_process_succeess() {
        int result = createPeople.todaysPeopleNum(todaysTotalVisit);
        verify(createPeople).todaysPeopleNum(todaysTotalVisit);
    }

    @Test   //김성규
    public void getPeopleForEachRidesTest_zyroDropPeople_is_greaterThan_50() {
        PeopleForEachRides peopleForEachRides = mock(PeopleForEachRides.class);
        when(peopleForEachRides.getPirateShipPeople()).thenReturn(3);
        assertThat(peopleForEachRides.getPirateShipPeople(), is(3));
    }

    @Test   //김성규
    public void seeEachPeopleNumTest_Once() {
        CreatePeople createPeople1 = mock(CreatePeople.class);
        createPeople1.seeEachPeopleNum(anyInt(), anyString());
        verify(createPeople1).seeEachPeopleNum(anyInt(), anyString());
    }
}
