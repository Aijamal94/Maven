package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();

        long amount = 1000;
        boolean registered = true;

        long bonus = bonusService.calculate(amount, registered);

        System.out.println("Bonus: " + bonus);
    }
}
