package Array;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArray = new int[10][20];
        //첫번쨰 차원에서는 10개의 요소
        //두번째 차원에서는 20개의 요소를 넣는다.
        intArray[0][2] = 129;

        int oneInt = intArray[0][2];
        System.out.println(oneInt);

        int[][] intArray2 = new int[10][20];
            //10개 , 20개다
        for(int i=0; i < intArray2.length; i++){
            //i가  10이 되기전까지 i++한다.

            for(int j=0; j < intArray2[i].length; j++){
                //j는 0 j가 10이 되기전까지 j를증가한다.
                System.out.println(i+"번쨰입니다:::::"+ "i: " + i + ", j: " + j);
            }
        }
    }


}
