package ac.kr.ajou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonInfo {
    private int tall;
    private int age;
    private boolean pregnancy;
}