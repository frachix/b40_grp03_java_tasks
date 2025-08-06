package src.fathi;

public class FINRA_Task_team {

    public static void main(String[] args) {
        int number = 3;
        int num = 5;

        for (number = 1; number <=30 ;number++) {
            String result;

            if (number % 3 == 0) {
                result = "FIN";
            } else if (number % 5 == 0) {
                result = "RA";

            } else if (number % 5 == 0 && number % 3 ==0) {
                result = "FINRA";

            }else{
                result = " " + number;
            }
            System.out.print(result);

        }
    }
    }


/*
   2.    Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number.
for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */






