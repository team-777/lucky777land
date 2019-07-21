package ac.kr.ajou;

import ac.kr.ajou.entrance.CreatePeople;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class MainApplicationTest {

    CreatePeople createPeople = new CreatePeople();
    private int todaysTotalVisit;

    @Test
    public void todaysPeopleNumTest_randomValue_must_not_0() {
        int result = createPeople.todaysPeopleNum(todaysTotalVisit);
        assertThat(result, not(0));
    }

}
