import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double price, vatRate,vat, vatPrice;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter price: ");
        price=input.nextDouble();
        System.out.println("Price entered:" +price);

        boolean enteredPrice= price<=1000;
        double result= enteredPrice ? (vatRate=0.18) : (vatRate=0.08);
        System.out.println("Vat rate:" +vatRate);
        vat=(price*vatRate);
        System.out.println("VAT:" +vat);
        vatPrice=price+vat;
        System.out.println("Price with VAT:"+vatPrice);

    }
}
