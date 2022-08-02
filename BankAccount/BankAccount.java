import java.text.NumberFormat;
import java.util.Random;

public class BankAccount{

    private double checkingBalance;
    private double savingBalance;
    private String accountNumber = "";

    private static int numAccounts = 0;
    private static double totalMoney = 0.0;
    private static Random randMachine = new Random();

    public BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        BankAccount.addAccount(checkingBalance+savingBalance);
        accountNumber = BankAccount.getNumber();
    }

    public static void addAccount(double total){
        numAccounts++;
        totalMoney+=total;
    }

    public static void displayTotalMoney(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(totalMoney));
    }

    private static String getNumber(){
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        String newPassword = "";
        for (int i = 0; i < 10; i++){
            newPassword += numbers[randMachine.nextInt(10)];
        }
        return newPassword;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    public void depositMoney(String accountType, double amount){
        if (accountType.toLowerCase() == "checking")
            checkingBalance += amount;
        else if (accountType.toLowerCase() == "saving")
            savingBalance += amount;
    }

    public void withdrawMoney(String accountType, double amount){
        if (accountType.toLowerCase() == "checking"){
            if (checkingBalance < amount)
                System.out.println("Insufficient Funds");
            else
                checkingBalance += amount;
        }

        else if (accountType.toLowerCase() == "saving")
            if (savingBalance < amount)
                System.out.println("Insufficient Funds");
            else
                savingBalance += amount;
        }

    public void seeTotalBalance(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(savingBalance+checkingBalance));
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    
}


