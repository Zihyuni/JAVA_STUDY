package list;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        //forEach문으로 돌려보자!!!

        for(Object abc:list){
            System.out.println(abc);
        }
    }
}
