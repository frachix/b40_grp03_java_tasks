package src.fathi;

public class FENRA_Task_team {

    public static void main(String[] args) {
        int number = 3;
        int num = 5;

        for (number = 1; number <=100 ;number++) {
            String result;

            if (number % 3 == 0) {
                result = "FEN";
            } else if (number % 5 == 0) {
                result = "RA";

            } else if (number % 5 == 0 && number % 3 ==0) {
                result = "FENRA";

            }else{
                result = " " + number;
            }
            System.out.print(result);

        }
    }
    }









