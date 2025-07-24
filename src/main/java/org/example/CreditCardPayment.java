package org.example;

import java.util.Objects;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;

    public CreditCardPayment(String cardNumber, String expirationDate, String accountHolderName) {
        super(accountHolderName);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean processPayment(double amount) {
        return cardNumber.length() == 19;
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
