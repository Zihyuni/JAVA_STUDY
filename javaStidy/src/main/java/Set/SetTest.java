package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set list = new HashSet();

        list.add("123");
        list.add("456");
        list.add("678");
        list.add("987");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            //이건 잘나왔다
        }
        System.out.println(iterator.toString());
    }
}
