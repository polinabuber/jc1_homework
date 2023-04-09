package part6.task26;

public class ATM_machine {

    public ATM_machine() {
        UserDisplay userDisplay = new UserDisplay();
        Storage banknotesStorage = new Storage();
        Account account = new Account();
    }

    public void work() {
        System.out.println("--------- Банкомат ---------");
        Account.user();
        UserDisplay.startMenu();
    }





}