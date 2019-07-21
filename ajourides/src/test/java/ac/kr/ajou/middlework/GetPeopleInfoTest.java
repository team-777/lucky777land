package ac.kr.ajou.middlework;

import ac.kr.ajou.domain.PersonInfo;
import org.junit.Before;
import org.junit.Test;
import ac.kr.ajou.middlework.GetPeopleInfo;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GetPeopleInfoTest {
    @Mock
    private GetPeopleInfo getPeopleInfo;
    private PeopleIntoGroups peopleIntoGroups;

    @Test
    public void 각_놀이기구에_따라_minage가_설정되는지_테스트(){ //201520969 이재형
        GetPeopleInfo getPeopleInfo = new GetPeopleInfo();
        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        List<PersonInfo> peopleList = new ArrayList<>();
        peopleList = peopleIntoGroups.GroupsIntoNull(peopleList,20);

        getPeopleInfo.PeopleInfo(peopleList.subList(0,20), 20);
        assertThat(getPeopleInfo.getMinage(),is(4));

        peopleList = peopleIntoGroups.GroupsIntoNull(peopleList,40);
        getPeopleInfo.PeopleInfo(peopleList.subList(0,40), 40);
        assertThat(getPeopleInfo.getMinage(),is(12));

        peopleList = peopleIntoGroups.GroupsIntoNull(peopleList,60);
        getPeopleInfo.PeopleInfo(peopleList.subList(0,60), 60);
        assertThat(getPeopleInfo.getMinage(),is(10));
    }

    @Test(timeout = 5000)
    public void MerryGoRound가4초안에_끝나는지_테스트(){ //201520969
        GetPeopleInfo getPeopleInfo = new GetPeopleInfo();
        PeopleIntoGroups peopleIntoGroups = new PeopleIntoGroups();
        List<PersonInfo> peopleList = new ArrayList<>();
        peopleList = peopleIntoGroups.GroupsIntoNull(peopleList,20);

        getPeopleInfo.PeopleInfo(peopleList, 20);
    }

}
