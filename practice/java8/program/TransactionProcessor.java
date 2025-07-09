package practice.java8.program;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given a list of Transaction objects (where each Transaction has properties: id, amount, currency, and status), write a method using the Stream API
 * to return a map where the key is the currency, and the value is the total sum of amount for transactions that have the status "COMPLETED". Ignore
 * transactions with other statuses.
 */
class Transaction {
    private String id;
    private double amount;
    private String currency;
    private String status;

    // Constructor
    public Transaction(String id, double amount, String currency, String status) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStatus() {
        return status;
    }
}

public class TransactionProcessor {
    public static Map<String, Double> getCompletedTransactionTotals(List<Transaction> transactions) {

       return transactions.stream().filter(transaction -> "COMPLETED".equals(transaction.getStatus()))
                .collect(Collectors.groupingBy(Transaction::getCurrency, Collectors.summingDouble(Transaction::getAmount)));
    }

    public static void main(String[] args) {
        // Sample list of transactions
        List<Transaction> transactions = Arrays.asList(
            new Transaction("1", 100.0, "USD", "COMPLETED"),
            new Transaction("2", 200.5, "USD", "PENDING"),
            new Transaction("3", 150.0, "EUR", "COMPLETED"),
            new Transaction("4", 50.5, "USD", "COMPLETED"),
            new Transaction("5", 20.0, "EUR", "FAILED"),
            new Transaction("6", 300.0, "JPY", "COMPLETED")
        );

        // Call the method and print the result
        Map<String, Double> result = getCompletedTransactionTotals(transactions);
        System.out.println(result); // Output: {USD=150.5, EUR=150.0, JPY=300.0}
    }
}