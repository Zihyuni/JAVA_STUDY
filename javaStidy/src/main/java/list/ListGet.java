package list;

import java.util.ArrayList;
import java.util.List;

public class ListGet {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("요소1");
        list.add("요소2");
        list.add("요소3");

        //인덱스 하나하나에 값을 넣주겠습니다.

        String element1 = list.get(0);
        String element2 = list.get(1);
        String element5 = list.get(2);

        //넣고싶은 인덱스 번호로 넣으면 된다.


        System.out.println("첫번째 요소:: "+element1);
        System.out.println("두번째 요소::" +element2);
        System.out.println("다섯번째 요소::" +element5);
    }
}
