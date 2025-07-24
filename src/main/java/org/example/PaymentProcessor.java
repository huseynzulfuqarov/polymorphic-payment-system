package org.example;

public class PaymentProcessor {

    public static void main(String[] args) {

        PaymentMethod[] methods = new PaymentMethod[2];
        CreditCardPayment cartMethod = new CreditCardPayment("\"1234-1234-1234-1234", "12-12-2027", "Ali Aliz");
        BankTransferPayment bankTransfer = new BankTransferPayment("32432ERT32", "Hemid Hemidov");

        methods[0] = cartMethod;
        methods[1] = bankTransfer;

        double amount = 150.00;

        for (PaymentMethod method : methods) {
            System.out.println("Payment owner: " + method.getAccountHolderName());
            boolean result = method.processPayment(amount);
            if (result) {
                System.out.println("Payment successful");
            }
            else {
                System.out.println("Payment failed");
            }
        }
    }
}
