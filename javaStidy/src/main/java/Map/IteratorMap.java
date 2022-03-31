package Map;

import java.util.HashMap;
import java.util.Iterator;

public class IteratorMap {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("사과","apple");
        map.put("포도","grape");
        map.put("복숭아","peach");
        map.put("귤","orange");


        Iterator<String> keyIterator = map.keySet().iterator();
        
        while(keyIterator.hasNext()){
            String akey = keyIterator.next();
            String avalue = map.get(akey);

            System.out.println("akey:::"+akey);
            System.out.println("avalue:::"+avalue);

        }
    }

}
