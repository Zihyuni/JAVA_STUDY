package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);

        //컬렉션에서 스트림을 생성한다.

        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
        /*
        스트림의 forEach는 해당 스트림의 요소를 하나씩 소모해가며
        순차적으로 요소에 접근 하는 메소드.
        같은 스트림으로 forEach는 한번 밖에 호출할 수 없다.
         */
    }
}
