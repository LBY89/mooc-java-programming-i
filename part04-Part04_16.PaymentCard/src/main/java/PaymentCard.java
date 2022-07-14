public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.6) {
            this.balance -= 2.60;
        } else if (this.balance == 0) {
            return;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.6) {
            this.balance -= 4.60;
        } else if (this.balance == 0) {
            return;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        if (this.balance + amount < 150) {
            this.balance += amount;
        } else if (this.balance + amount >= 150) {
            this.balance = 150;
        }
    }
}