package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetStream {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("ONEW1");
        set.add("TWO2");
        set.add("THREE3");

        Stream<String> stream = set.stream();

        stream.forEach((element)->{
            System.out.println(element);});
        };

    }

