package src.fathi;

public class FELENDRA {
    public static void main(String[] args) {
       /* 2.    Numbers -- FINRA
        Write a method which prints out the numbers from 1 to 90 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
                print "RA" instead of the number.
        for numbers which are a multiple of both 6 and 8, print "FINRA" instead of the number.

 */

        int num = 6;
        int num1 = 8;

        for (num = 0; num <=70 ; num++) {
            String result;
            if (num % 3==0){
                result="FIN";
            } else if (num% 5==0 ) {
                result="RA";
            }else if(num%3==0&& num%5==0) {
                result = "FINRA";
            }else {
                result = " "+ num;



            }
            System.out.println(result);

        }

    }
}
