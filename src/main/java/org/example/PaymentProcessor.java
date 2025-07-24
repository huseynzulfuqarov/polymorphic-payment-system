package org.example;

public class PaymentProcessor {

    public static void main(String[] args) {

        PaymentMethod[] methods = new PaymentMethod[3];
        CreditCardPayment cartMethod1 = new CreditCardPayment("Ali Aliz", "1234-1234-1234-1234", "12-12-2027");
        CreditCardPayment cartMethod2 = new CreditCardPayment("Qzh Vec", "1234-1234-1234", "12-12-2028");
        BankTransferPayment bankTransfer = new BankTransferPayment("Hemid Hemidov", "32432ERT32");

        methods[0] = cartMethod1;
        methods[1] = cartMethod2;
        methods[2] = bankTransfer;

        double amount = 150;

        for (PaymentMethod method : methods) {
            System.out.println("Payment owner: " + method.getAccountHolderName());
            boolean result = method.processPayment(amount);
            if (result) {
                System.out.println("Payment successful.");
            }
            else {
                System.out.println("Payment failed.");
            }
        }
    }
}
