package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("abc");
        stringList.add("def");

        Stream<String> stream = stringList.stream();
        //스트링형식의 스트림 리스트를 만들어준다.

        List<String> stringList2 = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        Stream<String> stream2 = stringList.stream();
        stream.forEach(element -> {
            System.out.println("모든 요소" + element);
        });
        //출력할떈 람다식을 써야하는건가?
        //람다식을 써야만 움직일 거같긴하다.
    }
}

