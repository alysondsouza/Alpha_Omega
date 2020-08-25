//GETTERS AND SETTERS - PRIVATE VARIABLES
//CONSTRUCTORS OVERLOAD
//THIS()
//CONSTRUCTOR + IF
//SETTERS AND GETTERS
//TO_STRING

package _OOP.Constructor_Overloading;

public class Constructor_Overloading {

    public static void main(String[] args) {

        System.out.println("\nCustomer 1:");
        Bank_Getters_Setters customer1 = new Bank_Getters_Setters(); //The constructor - 0 paramenters - has already defined variables at it's initialization
        System.out.println("\nStandard values when instantiate the object for the first time:\n" + customer1);
        customer1.makeDeposit(235);
        customer1.makeWithdraw(100);

        System.out.println("\nCustomer 2:");
        Bank_Getters_Setters customer2 = new Bank_Getters_Setters("OnDemand", 1000); //Constructor Overloading - 2 parameters //Filter: AccountType (checking - savings)
        System.out.println("\nValues set at object instantiation:\n" + customer2);
        customer2.makeDeposit(130);
        customer2.makeWithdraw(250);
        customer2.makeWithdraw(1000);
        customer2.getBalance();

    }


    //INNER CLASS
    public static class Bank_Getters_Setters {//Class

        //PRIVATE VARIABLES
        private String accountType;
        private double balance;

        //CONSTRUCTORS
        public Bank_Getters_Setters() { //Constructor with no parameters
            this("checking", 0.0); //THIS() initializes the constructor with default values
        }

        public Bank_Getters_Setters(String accountType, double balance) { //Constructor with 2 parameters + IF statement
            if (accountType.equals("checking") || accountType.equals("savings")) {
                this.accountType = accountType;
            } else {
                System.out.println("Constructor filter: \nCan't open an account of type: " + accountType + ". \nAccount type is set to default: checking.");
                this.accountType = "checking";
            }

            this.balance = balance;
        }

        //METHODS
        public void makeDeposit(int deposit) {
            balance += deposit;
            System.out.println("You have deposited " + deposit + " kr, and your new balance is: " + balance + " kr.");
            this.setBalance(balance);
        }

        public void makeWithdraw(int withdraw) {
            if ((balance - withdraw) > 0) {
                balance -= withdraw;
                System.out.println("You have withdrawn " + withdraw + " kr, and your new balance is: " + balance + " kr.");
            } else {
                System.out.println("You can't withdraw " + withdraw + ". You don't have enough funds. Your balance is: " + balance + " kr.");
            }
            this.setBalance(balance);
        }

        //GETTERS AND SETTERS
        public double getBalance() {
            System.out.println("The balance is: " + this.balance);
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        //TO_STRING
        @Override
        public String toString() {
            return "AccountType: " + accountType +
                    ",\t\tBalance: " + balance;
        }
    }
}


