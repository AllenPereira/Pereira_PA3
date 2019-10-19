public class App {
    public static void main(String args[]) {

        SavingsAcountt saver1 = new SavingsAcountt(2000.00);
        SavingsAcountt saver2 = new SavingsAcountt(3000.00);

        int i, j;
        double firstRate = .04;
        double secondRate = .05;
        double rate;
        System.out.printf("Interest rate is 4.0 percent\n\n");
        System.out.printf("Month\tsaver1\t\t\t\tsaver2\n");

        for (i = 0; i < 2; i++) {
            if (i == 0) {
                rate = firstRate;
            } else {
                rate = secondRate;
                System.out.printf("\nInterst Rate is increased to 5.0 percent\n\n");
            }
            for (j = 0; j < 12; j++) {
                if(i==0) {
                    System.out.printf("%d\t", j + 1);
                }
                else{
                    System.out.printf("%d\t", j + 13);
                }
                SavingsAcountt.modifyInterestRate(rate);
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                saver1.print();
                saver2.print();
                System.out.println();
            }
        }
    }

}
