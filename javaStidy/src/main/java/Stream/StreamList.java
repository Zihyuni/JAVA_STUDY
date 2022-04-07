package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"고양이", "개", "토끼", "코끼리"});

        List<String> list2 = list.stream().sorted().collect(Collectors.toList());

        System.out.println("list::::" + list);
        System.out.println("list2::::" + list2);

        /*코딩을 할 때 원본 컬렉션을 수정ㅎㅏ지 않고 원본 컬렉션을 통해 새로운 컬렉션을 만들때
            데이터를 유지하는 방향으로 만든다
            반복문 사용할 필요없이 스트림을 사용한다
         */

        //*****************아래코드는 에러가 발생한다 (런타임 에러)**********************//
//        Stream<String> listStream = list.stream();
//        List<String> list2 = listStream.sorted().collect(Collectors.toList());
//      객체를 만들어서 그것을 한번 사용하고 다시 사용했을때 런타임 에러가 발생한다
//      스트림은 데이터를 모두 읽고나면 사라지는 일회용이다

//        listStream.forEach(System.out::print);

    }

}