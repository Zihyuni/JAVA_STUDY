package Set;

import java.util.HashSet;
import java.util.Set;

public class SetEmpty {

    public static void main(String[] args) {


        //객체가 안에 들어있는지 없는지 확인하는 작업
        //객체가 없으면 ture를 리턴하고 있으면  false를 리턴한다.
        Set<String> set = new HashSet<>();
        set.add("123");

        Set<String> set2= new HashSet<>();


        boolean isEmpty1 = set.isEmpty();
        System.out.println(isEmpty1);

        boolean isEmpty2 = set2.isEmpty();
        System.out.println(isEmpty2);

    }
}
