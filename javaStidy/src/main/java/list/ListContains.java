package list;

import java.util.ArrayList;
import java.util.List;

public class ListContains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String element1 = "요소1";

        list.add(element1);

        boolean containsElement = list.contains("요소1");
        //객체에 넣어본다 contains는 비교해서 해다앟는 객체가 있으면 true 없으면 false를 반환
        System.out.println(containsElement);

        list.add(null);
        //널값도 넣을 수 있다.
        //널값이 있으면 true 없으면 false이다.
        boolean containsElement2 = list.contains(null);

        System.out.println(containsElement2);
    }
}
