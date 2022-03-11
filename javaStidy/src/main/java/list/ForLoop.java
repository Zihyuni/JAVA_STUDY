package list;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");
        //기본 for문으로 작성하기.
        for(int i=0; i < list.size(); i++) {
            Object element = list.get(i);

            System.out.println(element);

        }
    }
}
