package Set;

import java.util.HashSet;
import java.util.Set;

public class SetSize {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("456");
        set.add("789");
        set.add("987");

        int setSize = set.size();
        //이건 객체에 갯수가 몇개인지 확인하는 것입니다!!
        System.out.println(setSize);


    }
}
