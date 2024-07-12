package com.vaughnmesquita.finance.services;

//From GPT

import com.vaughnmesquita.finance.models.Income;
import com.vaughnmesquita.finance.models.Expenses;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private List<Income> incomes = new ArrayList<>();
    private List<Expenses> expenses = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public void addExpense(Expenses expense) {
        expenses.add(expense);
    }

    // Methods to edit and delete transactions
}