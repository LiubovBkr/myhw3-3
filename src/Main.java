public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearCredit = service.calculate(1000000, 9.99, 1);
        System.out.println(oneYearCredit);

        int twoYearsCredit = service.calculate(1000000, 9.99, 2);
        System.out.println(twoYearsCredit);

        int threeYearsCredit = service.calculate(1000000,9.99, 3);
        System.out.println(threeYearsCredit);
    }
}