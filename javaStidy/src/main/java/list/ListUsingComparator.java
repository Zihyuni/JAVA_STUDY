package list;

import SortedSet.Comparator1;

import java.util.*;

public class ListUsingComparator {
    public static void main(String[] args) {

        List<Nct> list = new ArrayList<>();

        list.add(new Nct("이동혁", 23, "korad"));
        list.add(new Nct("박지성", 21, "Korea"));
        list.add(new Nct("동스청", 26, "china"));

//
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            //    System.out.println(iterator.next());
//        }          //이렇게하면 객체주소만 나온다.
//
//o    Comparator<Nct> NewMember = new Comparator<Nct>() {
////        @Override
////        public int compare(Nct o1, Nct o2) {
////            return o1.age.compareTo(o2.name);
////        }
////    };
////        Collections.sort(list.NctMember);
////    }
//}
    }
}

