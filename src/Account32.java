public class Account32 {
    public static void main(String[] args){
        Account banker = new Account("Matt's account", 1000);
        banker.withdrawal(100);
        System.out.println(banker);

        Account banker1 =new Account("My account", 0);
        banker1.deposit(100);
        System.out.println(banker1);
    }
}
