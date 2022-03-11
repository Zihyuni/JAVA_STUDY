package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAddAll {
    public static void main(String[] args) {
        List<String> listSource = new ArrayList<>();

        listSource.add("123넣을거");
        listSource.add("456넣을거");

        List<String> listDest = new ArrayList<>();

        listDest.addAll(listSource);
        //listSource를 통째로 집어넣겠습니다!!!

        Iterator iterator = listDest.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            ;
        }
    }
}
