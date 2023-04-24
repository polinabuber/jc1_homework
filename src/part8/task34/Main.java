package part8.task34;

public class Main {
    public static void main(String[] args) {
        ClassicCard classicCard = new ClassicCard();
        CreditCard creditCard = new CreditCard();
        DebetCard debetCard = new DebetCard();
        ExpressCard expressCard = new ExpressCard();
        InternationalCard internationalCard = new InternationalCard();
        LocalCard localCard = new LocalCard();
        TypeOfOperations typeOfOperations = new TypeOfOperations();
        TypeOfPayment typeOfPayment = new TypeOfPayment();
        TypeOfRegistration typeOfRegistration = new TypeOfRegistration();


        System.out.println(typeOfPayment.getInfo()+" карты подразделяются на: "+internationalCard.getInfo()+ " и "+ localCard.getInfo());
        System.out.println(typeOfOperations.getInfo()+" карты подразделяются на: "+debetCard.getInfo()+ " и "+ creditCard.getInfo());
        System.out.println(typeOfRegistration.getInfo()+" карты подразделяются на: "+expressCard.getInfo()+ " и "+ classicCard.getInfo());
    }
}
