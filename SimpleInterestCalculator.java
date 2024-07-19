package secondlab;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000;
        double annualInterestRate = 5;
        double timePeriod = 3;

        double simpleInterest = (principal * annualInterestRate * timePeriod) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}

