public class SavingsAcountt {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAcountt(double amount){

        savingsBalance = amount;
    }

    public void calculateMonthlyInterest(){

        savingsBalance += (savingsBalance * annualInterestRate)/12;
    }

    public static void modifyInterestRate(double interestRate){
        annualInterestRate = interestRate;

    }
    public void print(){
        System.out.printf("\t$%.2f\t\t", this.savingsBalance);
    }

}
