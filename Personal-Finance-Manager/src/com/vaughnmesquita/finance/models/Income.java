package com.vaughnmesquita.finance.models;

import java.time.LocalDate;

public class Income {
    private double Payment;
    private String PaymentSource;
    private LocalDate PaymentDate;

    public Income(double payment, String paymentSource, LocalDate paymentDate) {
        this.Payment = payment;
        this.PaymentSource = paymentSource;
        this.PaymentDate = paymentDate;
    }

    public double getPayment() {
        return Payment;
    }

    public String getPaymentSource() {
        return PaymentSource;
    }

    public LocalDate getPaymentDate() {
        return PaymentDate;
    }

    public void setPayment(double payment) {
        Payment = payment;
    }

    public void setPaymentSource(String paymentSource) {
        PaymentSource = paymentSource;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        PaymentDate = paymentDate;
    }
}
