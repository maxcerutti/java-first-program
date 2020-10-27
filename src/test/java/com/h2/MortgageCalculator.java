package com.h2;

public class MortgageCalculator {
    private long loanAmount = 0;
    private int termInYears = 0;
    private float annualRate = 0.0f;
    private double monthlyPayment = 0d;

    public MortgageCalculator(long loanAmount, int termInYears, float annualRate){
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.annualRate = annualRate;
    }

    private int getNumberOfPayments(){
        return termInYears * 12;
    }

    private float getMonthlyInterestRate(){
        float interestRate = annualRate / 100;
        return interestRate * 12;
    }
}
