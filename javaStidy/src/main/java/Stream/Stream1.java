package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        /*Stream ::: collection이나 iterator같은 인터페이스를 이용해서 컬렉션을
        다루지않고 (List정렬시에는 conllection.sort를 사용해야하고 배열을 정렬할 때는 Arrays.sort()를 사용해야 함)
        이렇게 데이터마다 속성이 다른걸 정리해주는 것이라한다.

        스트림은 배열, 리스트 등 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 기능
        Collection 내부의 데이터 정렬, 필터링, 중복제거등을 구현 시 필요
        */

//        //리스트로 부터 스트림생성한다.
//        List<String> list = Arrays.asList("A","B","C");
//        Stream<String> listStream = list.stream();
//
//
//
//        //배열의 스트림을 생성한다.
//
//        Stream<String> stream = Stream.of("A" ,"B" ,"C");

        String[] strArr = {"aaa1" , "bbb2" , "ccc3"};
        List<String> strList = Arrays.asList(strArr);//리스트에 객체를 담아준다.

        //스트림을 생성해본다.

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        //스트림 출력
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        /*
        1.스트림은 데이터 소스로부터 데이터를 읽기만할뿐 변경하지 않는다.
        2.스트림은 한번 사용하면 닫혀서 다시 사용할 수 없다.
        3.스트림은 작업을 내부 반복으로 처리한다.
         */

    }
}

