public class CreditPaymentService {
    public int calculate(int price, double percent, int years) {
        int months = years * 12;
        double interestRate = percent * 0.01 / 12;
        double monthPayment = price * (interestRate * (Math.pow(1 + interestRate, months))) / (Math.pow(1 + interestRate, months) - 1);
        return (int) monthPayment;

    }
}
