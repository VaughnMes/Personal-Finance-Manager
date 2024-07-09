package com.vaughnmesquita.finance.models;

public class Savings {
    private double Deposit;
    private double Withdrawal;
    private double TotalAmt;
    private double AmtRemaining;

    public Savings(double deposit, double withdrawal, double amtRemaining) {
        this.Deposit = deposit;
        this.Withdrawal = withdrawal;
        this.AmtRemaining = amtRemaining;
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

    public double getDeposit() {
        return Deposit;
    }

    public double getWithdrawal() {
        return Withdrawal;
    }

    public double getAmtRemaining() {
        if ();
    }
}