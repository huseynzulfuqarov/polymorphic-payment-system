package org.example;

import java.util.Objects;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;

    public CreditCardPayment(String accountHolderName, String cardNumber, String expirationDate) {
        super(accountHolderName);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public boolean processPayment(double amount) {
        if(cardNumber.length() == 19) {
            System.out.printf("%.2f AZN payed with credit card.\n", amount);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditCardPayment that = (CreditCardPayment) o;
        return Objects.equals(cardNumber, that.cardNumber) && Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardNumber, expirationDate);
    }

    @Override
    public String toString() {
        return "Credit Cart Payment->"+ super.toString() +
                " | Cart Number" + cardNumber +
                " | Expiration Date" + expirationDate;
    }
}
