package list;

import java.util.ArrayList;
import java.util.List;

public class ListLastIndex {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String element1 = "요소 1 element";
        String element2 = "요소 2 element";

        list.add(element1);
        list.add(element2);
        list.add(element1);
        list.add(element2);

        int lastIndex = list.lastIndexOf(element1);
        System.out.println("마지막 인덱스는??"+lastIndex);
        //중복된 객체가 있으면 마지막 객체의 엔덱스 번호를 가져온다.

    }
}
