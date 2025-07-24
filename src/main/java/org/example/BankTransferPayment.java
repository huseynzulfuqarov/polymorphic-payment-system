package org.example;

import java.util.Objects;

public class BankTransferPayment extends PaymentMethod {
    private String bankIban;
    private final double transferFee = 2.50;

    public BankTransferPayment(String accountHolderName, String bankIban) {
        super(accountHolderName);
        this.bankIban = bankIban;
    }

    public String getBankIban() {
        return bankIban;
    }

    public double getTransferFee() {
        return transferFee;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("%.2f + %.2f AZN amount pay with bank transfer method.\n", amount, transferFee);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BankTransferPayment that = (BankTransferPayment) o;
        return Double.compare(transferFee, that.transferFee) == 0 && Objects.equals(bankIban, that.bankIban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bankIban, transferFee);
    }

    @Override
    public String toString() {
        return "Bank Transfer Payment-> " + super.toString() +
                " | Transfer Fee: " + transferFee +
                " | Bank IBAN: " + bankIban;
    }
}
