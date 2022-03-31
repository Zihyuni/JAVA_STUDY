package Array;

public class ArraysForLoop {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        //stringArray 는 10개의 크기를 담을 수 있음

        for(int i=0; i < stringArray.length; i++) {
            stringArray[i] = "String no " + i;
        }
        //i가 10이되기전까지 i++한다
        //stringArray에는 String No와i를 넣는다.

        for(int i=0; i < stringArray.length; i++) {
            System.out.println( stringArray[i] );
        //i는 0이다 i가 10보다 작을때까지 i++하고
        //출력을한다.
        }

        int[] intArray = new int[10];

        for(int i=0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        //Array인덱스마다 i를 집어넣는다.

        for(int i=0; i < intArray.length; i++) {
            System.out.println( intArray[i] );
            //출력한다.
        }

        int[] intArray2 = new int[10];
        //intArray2는 10이다.

        for(int theInt : intArray2) {
            System.out.println("theInt::::"+theInt);
        }
        //the Int는 intArray2다
        //theInt를 출력해보면 0이 10번나온다.

        String[] stringArray2 = {"one", "two", "three"};

        for(String theString : stringArray2) {
            System.out.println(theString);
        }
        //theString은 stringArray2다.
        //theString을 출력하면 one,two,three가 나온다.

    }
}
