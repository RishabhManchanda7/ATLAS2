package Day25;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Facade Method DP - Structural Design Pattern");
        MallFacade mallFacade = new MallFacade();
        mallFacade.getItems("Fruits");
        mallFacade.payBill("123", "billno 44", 500.0);
    }
}