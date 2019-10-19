import java.util.Scanner;
public class Prob1 {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        MathQuestions studentObject = new MathQuestions();
        int i;
        int proceed;

        System.out.printf("Would you like to study arithmetic problems?(Press 1 for yes, 2 for no)\n");
        proceed = scnr.nextInt();

        while(proceed == 1) {
            studentObject.promptUser();


            for(i=0; i<10; i++){
                studentObject.setOperator();
                studentObject.setRandomNumbers();
                studentObject.askQuestion();
                studentObject.setStudentAnswer();
                studentObject.calculateAnswer();
                studentObject.determineIfCorrect();
                studentObject.displayMessage();
                studentObject.countCorrect();
            }
            studentObject.percentageCorrect();
            studentObject = new MathQuestions();

            System.out.printf("\nWould you like to continue using the program?(Press 1 for yes, 2 for no)\n");
            proceed = scnr.nextInt();
        }
        scnr.close();
    }



}
