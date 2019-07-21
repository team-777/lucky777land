package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.PersonInfo;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

public class PeopleIntoGroupsTest {
    @Mock
    private PeopleIntoGroups peopleIntoGroups;

    @Test
    public void GroupIntoNull가_반환하는_리스트_테스트(){//201520969 이재형
        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        List<PersonInfo> peopleList = new ArrayList<>();
        List<PersonInfo> testList;
        testList = peopleIntoGroups.GroupsIntoNull(peopleList, 20);
        assertThat(testList.size(),is(20));
        assertNull(testList.get(0));
    }

}
