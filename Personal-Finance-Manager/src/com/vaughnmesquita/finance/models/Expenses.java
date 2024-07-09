package com.vaughnmesquita.finance.models;

public class Expenses {
    private double FixedExpenses;
    private double VariableExpenses;
    private double MiscExpenses;

    public Expenses(double fixedExpenses, double variableExpenses, double miscExpenses) {
        this.FixedExpenses = fixedExpenses;
        this.VariableExpenses = variableExpenses;
        this.MiscExpenses = miscExpenses;
    }

    public void setFixedExpenses(double fixedExpenses) {
        FixedExpenses = fixedExpenses;
    }

    public void setVariableExpenses(double variableExpenses) {
        VariableExpenses = variableExpenses;
    }

    public void setMiscExpenses(double miscExpenses) {
        MiscExpenses = miscExpenses;
    }

    public double getFixedExpenses() {
        return FixedExpenses;
    }

    public double getVariableExpenses() {
        return VariableExpenses;
    }

    public double getMiscExpenses() {
        return MiscExpenses;
    }
}

