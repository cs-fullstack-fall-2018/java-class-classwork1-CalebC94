public class Account2 {
    public static void main(String[] args) {
        Account bankteller = new Account("CU", 100);
        bankteller.deposit(20);
        System.out.println(bankteller.balance());
    }
}
