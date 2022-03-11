package list;

import java.util.*;

public class 리스트 {
    public static void main(String[] args) {

        /*
        리스트 종류
        -ArrayList
        -LinkedList
        -Vector
        -Stack
         */

        //리스트 생성 방법
        List listA = new ArrayList();
        List listB = new LinkedList();
        List listC = new Vector();
        List listD = new Stack();

        //일반 제네릭 리스트

        List<String> list = new ArrayList<>();
        list.add("hello~~~!!!");

        //tmp에 리스트 0번지를 담아보자
        String tmp = list.get(0);


        //출력해보면 hello~~~!!!가 나오는걸 볼 수 있다.
        System.out.println(tmp);
    }
}
