public class Main {
    public static void main(String[] args)
    {
        int creditCard = 5000;
        double firstPayment = creditCard * 1.17;
        double secondPayment = firstPayment * 1.17;

        System.out.println("Your first payment is " + "$" + firstPayment + " and your second payment is " + "$" + secondPayment + "!");
    }
}