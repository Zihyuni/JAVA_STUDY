package InstanceOfExample;

import java.util.HashMap;
import java.util.Map;

public class instanceOfExample {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();

        boolean maplsObject = map instanceof  Object;

        System.out.println(maplsObject);
    }
}
