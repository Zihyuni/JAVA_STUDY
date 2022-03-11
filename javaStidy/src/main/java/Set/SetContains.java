package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetContains {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("456");

        //contains는 객체안에 주어진 객체가 있는지 확인하는 것임!!
        boolean contains123 = set.contains("123");
        //123이 객체안에 있기때문에 true를 리턴한다.
        System.out.println(contains123);

        boolean contains789 = set.contains("789");
        System.out.println(contains789);
        //789가 없기 떄문에 false를 리턴한다.

        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set2.add("456");
        set2.add(null);
        //null값도 포함할 수 있다.
        //그리고 그 null값이 있는지 없는지를 찾을 수 있다.
        boolean containsElement = set2.contains(null);
        boolean containsElement2 = set3.contains(null);
        System.out.println("여기는 set2야"+containsElement);
        System.out.println("여기는 set3야"+containsElement2);
    }


}
