package com.DkAngelo.exercises.collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;



public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts){
        accounts.sort((o1, o2) -> Double.compare(o1.getAmount(), o2.getAmount()));
    }

    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort((o1, o2) -> Double.compare(o1.getInterestRate(), o2.getInterestRate()));
    }

    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort((o1, o2) -> o1.getDuePayment().compareTo(o2.getDuePayment()));
    }
}
