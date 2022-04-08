package Array;

public class 일차원배열 {
    public static void main(String[] args) {
        /*
        문법 :
        1. 타입[] 배열이름 ex) String[] member;
        2. 타입 배열이름 ex) String member[];
        될 수 있으면 1번째 방법만을 사용하는 것이 좋음


        문법 :
        배열이름 = new 타입[배열길이]
        타입[] 배열이름 = new 타입[배열길이]
         */

        int[] grade1 = new int[5];//길이가 5인 int형 배열의 선언과 생성
        int[] grade2 = new int[7];//길이가 7인 int형 배열의 선언과 생성



        grade1[0] = 20;//인덱스를 이용해서 배열을 초기화하고 값을 넣는다.
        grade1[1] = 21;
        grade1[2] = 22;
        grade1[3] = 23;
        grade1[4] = 24;

        //배열의 길이보다 적은 수의 배열요소만 초기화한다.
        grade2[0] = 85;

        for (int i=0; i< grade1.length; i++){
            System.out.print(grade1[i] + " ");
        }
        for (int i=0; i<grade2.length; i++){
            System.out.print(grade2[i] + " ");
        }
        /*
        grade2[0]번째 이후로는 초기화및 선언을 안해줬기떄문에
        0번째 이후부터는 0으로 값이 매겨진다.
         */


        /*
        int[] ex = new int[3];
        ex[0] = 1;
        ex[1] = 2;
        ex[2] = 3;

        System.out.println(ex[4])를 해버리면
        배열의 길이를 초과해버려서 ArrayIndexOutOfBounds가 발생한다

         */



    }
}
