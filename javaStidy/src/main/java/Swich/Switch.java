package Swich;

public class Switch {
    public static void main(String[] args) {

        int amount = 3;

        switch(amount) {
            case     0 : System.out.println("amount의 값은 0"); break;
            case     5 : System.out.println("amount의 값은 5"); break;
            case    10 : System.out.println("amount의 값은 10"); break;
            default    : System.out.println("amount의 값은 이 케이스 안에 없습니다.");
        }

        //****************************if문으로 작업 했을 경우**********************//
        if(amount==1){
            System.out.println("amount의 값은 1");
        }else if(amount==2){
            System.out.println("amount의 값은 2");
        }else if(amount==3){
            System.out.println("amount의 값은 3");
        }else{
            System.out.println("amount의 값은 여기 없습니다.");
        }


        //**************************int작업******************************//
        int size = 5;

        switch (size){
            case 0 : {
                System.out.println("size는 스몰입니다.");
                break;
            }
            case 1 : {
                System.out.println("size는 미디움입니다.");
                break;
            }
            case 2 : {
                System.out.println("size는 라지입니다.");
                break;
            }
            case 3 : {
                System.out.println("size는 엑스라지입니다.");
                break;
            }
            default:{
                System.out.println("size는"+size+"입니다");
            }
        }

        //***********************문자 작업****************************//

        char size2 = 'S';

        switch (size2){
            case 'S' :{
                System.out.println("사이즈는 S입니다.");
                break;
            }
            case 'M' :{
                System.out.println("사이즈는 M입니다.");
                break;
            }
            case 'L' :{
                System.out.println("사이즈는 L입니다.");
                break;
            }
            case 'X' :{
                System.out.println("사이즈는 XL입니다.");
                break;
            }

            default:{
                System.out.println("사이즈는 기준표에 없어요 사이즈는"+size2+"입니다.");
            }
        }

        //**************************문자열  작업********************************//
        String size3 = "엑스라지";

        switch (size3){
            case "스몰":{
                System.out.println("사이즈는 스몰 입니다.");
                break;
            }
            case "미디움":{
                System.out.println("사이즈는 미디움 입니다.");
                break;
            }
            case "라지":{
                System.out.println("사이즈는 라지 입니다.");
                break;
            }
            case "엑스라지":{
                System.out.println("사이즈는 엑스라지 입니다.");
                break;
            } default:
                System.out.println("해당되는 사이즈가 없습니다.");
                break;
            }

    }




}
