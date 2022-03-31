package forLoop;

public class forLoopStar {

    public static void main(String[] args) {
        //************for문으로 별찍기***************//

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
                //print이기에 가로로 계속 찍는다.
                //안에는 4번 돈다.
            }
            System.out.println("");
        }//밖에는 3번 돈다.

        System.out.println("//////////////////////////////////////////////////");
        for (int i = 0; i < 5; i++) {//5가되기전 까지니까 4번돈다.
            for (int j = 0; j < i; j++) {//j는 0이다.j가 i보다 크기전까지 j는 계속 ++한다.
                System.out.print("*");
                //++할때마다 * 을 찍는다.
            }
            System.out.println("");
            //++하고 끝나면 ""를 찍는다.

        }
        System.out.println("////////////////////////////////////////////////");

        for (int i=0; i<4; i++){    //4가되기전까지 반복한다 3번반복하는거임
            for (int j=0; j<3-i;j++){
                //j는 0이다 j보다 (3-i)이 더 클때까지 j++한다.
                //j보다 (3-i)가 더 크면 j++하면서 " "를 찍는다.
                System.out.print(" ");
            }for(int j=0; j<2*i+1; j++){
                //j는 0이다 j가 2*i+1한게 j보다 크면 j는++한다
                //j보다 (2*i+1)한게 더 크면 j를 ++하면서 *를 찍는다.
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
