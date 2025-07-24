package org.example;

import java.util.Objects;

public abstract class PaymentMethod {
    private String accountHolderName;

    public PaymentMethod(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public abstract boolean processPayment(double amount);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethod that = (PaymentMethod) o;
        return Objects.equals(accountHolderName, that.accountHolderName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountHolderName);
    }

    @Override
    public String toString() {
        return "PaymentMethod ->" +
                " | Account Holder Name: " + accountHolderName;
    }
}
