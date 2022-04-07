package Lamda;

import Array.Array;

import java.util.Arrays;

public class Lamda1<num> {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        Arrays.stream(num).filter(i->i%2==0).forEach(System.out::println);

        for(int i:num){
            if(i%2==0){
                System.out.println(i);
            }
        }




    }
}
