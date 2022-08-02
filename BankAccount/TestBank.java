public class TestBank{
    public static void main(String[] args){
        BankAccount newBank = new BankAccount(45.67, 39.00);
        System.out.println(newBank.getAccountNumber());
        BankAccount.displayTotalMoney();
    }
}