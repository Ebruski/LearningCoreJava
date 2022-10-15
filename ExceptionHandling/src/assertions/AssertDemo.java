package assertions;

public class AssertDemo {
    public static void main(String[] args) {

        int withdrawlAmount = 200;
        int currentBalance = 100;

        assert (withdrawlAmount <= currentBalance):"Withdrawal amount is more than current balance";

    }
}
