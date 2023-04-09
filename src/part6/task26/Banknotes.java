package part6.task26;

public class Banknotes {

    private final int name;
    private int count;

    public Banknotes(int name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void decreaseCount() {
        count--;
    }

}