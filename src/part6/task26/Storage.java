package part6.task26;

public class Storage {
    static Banknotes[] banknotes;

    public Storage() {
        banknotes = new Banknotes[3];
        banknotes[0] = new Banknotes(20, 1000);
        banknotes[1] = new Banknotes(50, 1000);
        banknotes[2] = new Banknotes(100, 1000);
    }

    public static Banknotes[] getBanknotes() {
        return banknotes;
    }

    public static Banknotes getBanknotesByNumber(int banknotesNumber) {
        return banknotes[banknotesNumber - 1];
    }

    public static boolean removeBanknotes(Banknotes selectedBanknotes) {
        if (selectedBanknotes.getCount() == 0) {
            return false;
        }
        selectedBanknotes.decreaseCount();
        return true;
    }
}