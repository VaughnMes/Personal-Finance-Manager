package com.vaughnmesquita.finance.models;

import java.time.LocalDate;

public class Savings {
    private double Deposit;
    private double Withdrawal;
    private double TotalAmt;
    private double AmtRemaining;
    private String PaymentSource;
    private LocalDate PaymentDate;


    public Savings(double deposit, double withdrawal, double totalAmt, double amtRemaining, String paymentSource, LocalDate paymentDate) {
        this.Deposit = deposit;
        this.Withdrawal = withdrawal;
        this.TotalAmt = totalAmt;
        this.AmtRemaining = amtRemaining;
        this.PaymentSource = paymentSource;
        this.PaymentDate = paymentDate;
    }

    public void setDeposit(double deposit) {
        Deposit = deposit;
    }

    public void setWithdrawal(double withdrawal) {
        Withdrawal = withdrawal;
    }

    public void setTotalAmt(double totalAmt) {
        TotalAmt = totalAmt;
    }

    public void setAmtRemaining(double amtRemaining) {
        AmtRemaining = amtRemaining;
    }

    public void setPaymentSource(String paymentSource) {
        PaymentSource = paymentSource;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        PaymentDate = paymentDate;
    }

    public double getDeposit() {
        return Deposit;
    }

    public double getWithdrawal() {
        return Withdrawal;
    }

    public double getTotalAmt() {
        return TotalAmt;
    }

    public double getAmtRemaining() {
        return AmtRemaining;
    }

    public String getPaymentSource() {
        return PaymentSource;
    }

    public LocalDate getPaymentDate() {
        return PaymentDate;
    }
}