package list;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        int size = list.size();
        //리스트의 담긴 객체들
        // 곧 리스트의 사이즈를 책정한다.
        System.out.println(size);
    }
}
