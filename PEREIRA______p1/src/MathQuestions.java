import java.util.Scanner;
import java.security.SecureRandom;

public class MathQuestions {
    private double number1;
    private double number2;
    private int difficulty;
    private int choice;
    private int operator;
    private boolean answer;
    private double studentAnswer;
    private double calculatedAnswer;
    private double correct=0;

    Scanner scnr = new Scanner(System.in);
    SecureRandom rand = new SecureRandom();

    public void promptUser(){

        System.out.printf("What difficulty level would you like? (1-4)\n");
        this.difficulty = scnr.nextInt();

        System.out.printf("Which type of arithmetic problems would you like to study?\n");
        System.out.printf("1. Addition\n");
        System.out.printf("2. Multiplication\n");
        System.out.printf("3. Subtract\n");
        System.out.printf("4. Division\n");
        System.out.printf("5. Combination\n");
        this.choice = scnr.nextInt();


    }


    public void setRandomNumbers() {
        if(this.difficulty ==1) {
            this.number1 =rand.nextInt(9) +1;
            this.number2 = rand.nextInt(9) + 1;
        }
        else if(this.difficulty == 2){
            this.number1 = rand.nextInt(90) + 10;
            this.number2 = rand.nextInt(90) + 10;
        }
        else if(this.difficulty == 3){
            this.number1 = rand.nextInt(900) + 100;
            this.number2 = rand.nextInt(900) + 100;
        }
        else if(this.difficulty == 4){
            this.number1 = rand.nextInt(9000) + 1000;
            this.number2 = rand.nextInt(9000) + 1000;
        }
    }


    public void setOperator(){
        if(choice != 5) {
            this.operator = this.choice;
        }
        if(choice == 5){
            this.operator = rand.nextInt(4)+1;
        }
    }


    public void askQuestion() {
        if(this.operator == 1) {
            System.out.printf("What is %.0f plus %.0f?\n", this.number1, this.number2);
        }
        else if(this.operator == 2) {
            System.out.printf("What is %.0f times %.0f?\n", this.number1, this.number2);
        }
        else if(this.operator == 3) {
            System.out.printf("What is %.0f minus %.0f?\n", this.number1, this.number2);
        }
        else if(this.operator == 4) {
            System.out.printf("What is %.0f divided by %.0f? Round to two decimal spaces if neccesary\n", this.number1, this.number2);
        }
    }


    public void setStudentAnswer() {

        this.studentAnswer = scnr.nextDouble();
    }


    public void calculateAnswer() {
        if(this.operator == 1) {
            this.calculatedAnswer = this.number1 + this.number2;
        }
        else if(this.operator == 2) {
            this.calculatedAnswer = this.number1  * this.number2;
        }
        else if(this.operator == 3) {
            this.calculatedAnswer = this.number1 - this.number2;
        }
        else if(this.operator == 4) {
            this.calculatedAnswer = this.number1 / this.number2;
            this.calculatedAnswer *= 100;
            this.calculatedAnswer = Math.round(this.calculatedAnswer);
            this.calculatedAnswer /= 100;
        }
    }

    public void determineIfCorrect() {
        double epsilon = .001;

        if(Math.abs((this.studentAnswer - this.calculatedAnswer)) < epsilon){
            this.answer = true;
        }
        else {
            this.answer = false;
        }

    }

    public void displayMessage(){
        int randomNumber = rand.nextInt(4)+1;

        switch (randomNumber) {
            case 1:
                if(this.answer == true) {
                    System.out.printf("Very good!\n\n");
                }
                else {
                    System.out.printf("No. Please try again.>again.\n\n");
                }
                break;
            case 2:
                if(this.answer == true) {
                    System.out.printf("Excellent!\n\n");
                }
                else {
                    System.out.printf("Wrong.Try once more\n\n");
                }
                break;
            case 3:
                if(this.answer == true) {
                    System.out.printf("Nice Work!\n\n");
                }
                else {
                    System.out.printf("Don't give up!\n\n");
                }
                break;
            case 4:
                if(this.answer == true) {
                    System.out.printf("Keep up the good work!\n\n");
                }
                else {
                    System.out.printf("No. Keep trying.\n\n");
                }
                break;
        }
    }

    public void countCorrect() {
        if(this.answer == true) {
            this.correct++;
        }
    }

    public void percentageCorrect() {

        System.out.printf("You answered %.0f questions correctly and %.0f incorrectly.\n", this.correct, 10-this.correct);
        this.correct = (this.correct/ 10) * 100;
        if(this.correct >= 75) {
            System.out.printf("Congratulations, you are ready to go to the next level.\n");
        }
        else {
            System.out.printf("Please ask your teacher for extra help.\n");
        }
    }



}
