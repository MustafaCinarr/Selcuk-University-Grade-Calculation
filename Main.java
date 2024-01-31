import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Letter grade calculation , Selçuk University

        /* There are two exams at Selçuk University and they are
           evaluated out of 100.

           40 % of the first exam and 60 % of the second
           exam are added together and a letter grade is
           given according to the result.

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("First exam score...");
        int exam1 = scanner.nextInt();

        System.out.println("Second exam score...");
        int exam2 = scanner.nextInt();

        double total = exam1 * 0.4 + exam2 * 0.6;

        String letterGrade ="X";

        if (88 <= total && total <= 100) {

            letterGrade = "AA";
            System.out.println(letterGrade);

        }
        else if (80 <= total && total < 88) {

            letterGrade = "BA";
            System.out.println(letterGrade);

        }
        else if (73 <= total && total < 80) {

            letterGrade = "BB";
            System.out.println(letterGrade);

        }
        else if (66 <= total && total < 73) {

            letterGrade = "CB";
            System.out.println(letterGrade);

        }
        else if (60 <= total && total < 66) {

            letterGrade = "CC";
            System.out.println(letterGrade);
        }
        else if (50 <= total && total < 60) {

            letterGrade = "DC";
            System.out.println(letterGrade);

            System.out.println("Enter your overall academic grade point average...");
            // gano = overall academic grade point average

            float gano = scanner.nextFloat();

            if(gano>2.50){
                System.out.println("You passed the course...");
            }
            else {
                System.out.println("You failed the course...");
            }
        }
        else if (0 <= total && total < 50) {

            letterGrade = "FF";
            System.out.println("You failed the course...");
        }


    }
}