
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account meAccount = new Account("My account", 0);
        matthewsAccount.withdrawal(100.0);
        meAccount.deposit(100.0);
        System.out.println(matthewsAccount);
        System.out.println(meAccount);
    }
}
