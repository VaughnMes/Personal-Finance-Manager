package com.vaughnmesquita.finance.models;

import java.time.LocalDate;

public class Expenses {
    private double FixedExpenses;
    private double VariableExpenses;
    private double MiscExpenses;
    private LocalDate date;
    private String source;

    public Expenses(double fixedExpenses, double variableExpenses, double miscExpenses, LocalDate date, String source) {
       this.FixedExpenses = fixedExpenses;
        this.VariableExpenses = variableExpenses;
        this.MiscExpenses = miscExpenses;
        this.date = date;
        this.source = source;
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

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSource(String source) {
        this.source = source;
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

    public LocalDate getDate() {
        return date;
    }

    public String getSource() {
        return source;
    }
}

