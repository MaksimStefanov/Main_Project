package selfControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Electricity: ");
        String electricity = reader.readLine();
        System.out.println("Gas: ");
        String gas = reader.readLine();
        System.out.println("Gas Delivery: ");
        String gasDelivery = reader.readLine();
        System.out.println("Water(11126): ");
        String water11126 = reader.readLine();
        System.out.println("Water(100832): ");
        String water100832 = reader.readLine();
        System.out.println("Общая сумма: " + sum(Double.parseDouble(electricity), Double.parseDouble(gas), Double.parseDouble(gasDelivery),
                Double.parseDouble(water11126), Double.parseDouble(water100832)) + " UAH");
        System.out.println("Максим: " + mineInvoice(Double.parseDouble(electricity), Double.parseDouble(gas), Double.parseDouble(gasDelivery),
                Double.parseDouble(water11126), Double.parseDouble(water100832)) + " UAH");
        System.out.println("Артем: " + artemsInvoice(Double.parseDouble(electricity), Double.parseDouble(gas), Double.parseDouble(gasDelivery),
                Double.parseDouble(water11126), Double.parseDouble(water100832)) + " UAH");
        System.out.println("Юля: " + juliasInvoice(Double.parseDouble(electricity), Double.parseDouble(gas), Double.parseDouble(gasDelivery),
                Double.parseDouble(water11126), Double.parseDouble(water100832)) + " UAH");
        System.out.println("Витя: " + vityasInvoice(Double.parseDouble(electricity), Double.parseDouble(gas), Double.parseDouble(gasDelivery),
                Double.parseDouble(water11126), Double.parseDouble(water100832)) + " UAH");

    }

    public static double sum(double e, double g1, double g2, double w1, double w2) {
        double sum = e + g1 + g2 + w1 + w2;
        return sum;
    }

    public static double mineInvoice(double e, double g1, double g2, double w1, double w2) {
        double sum = e / 4 + g1 / 4 + g2 / 4 + w1 / 4 + w2 / 2;
        return sum;
    }

    public static double artemsInvoice(double e, double g1, double g2, double w1, double w2) {
        double sum = e / 4 + g1 / 4 + g2 / 4 ;
        return sum;
    }

    public static double juliasInvoice(double e, double g1, double g2, double w1, double w2) {
        double sum = e / 4 + g1 / 4 + g2 / 4 + w1 / 8 * 5 + w2 / 4;
        return sum;
    }

    public static double vityasInvoice(double e, double g1, double g2, double w1, double w2) {
        double sum = e / 4 + g1 / 4 + g2 / 4 + w1 / 8 + w2 / 4;
        return sum;
    }

}

