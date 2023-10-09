// BankingServiceFacade class
class BankingServiceFacade {
    private Account checkingAccount;
    private Account savingsAccount;
    private Account investmentAccount;

    public BankingServiceFacade() {
        checkingAccount = new Checking();
        savingsAccount = new Savings();
        investmentAccount = new Investment();
    }

    public void accessChecking() {
        checkingAccount.checkBalance();
    }

    public void accessSavings() {
        savingsAccount.checkBalance();
    }

    public void accessInvestment() {
        investmentAccount.checkBalance();
    }
}