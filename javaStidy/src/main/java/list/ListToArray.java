package list;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("요소1입니다!");
        list.add("요소2입니다.");
        list.add("요소3입니다.");
        list.add("요소4입니다.");

        Object[] objects = list.toArray();
        //오브젝트 객체로 listArray를 담아버린다
        System.out.println(objects[0]);
        //출력할때 인덱스를 출력하면된다.


        String[] objects1 = list.toArray(new String[2]);
        System.out.println(objects1[2]);
    }
}
