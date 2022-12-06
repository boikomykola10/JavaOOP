package WineTask;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        //створюєм екземпляр класа
        Wine w1 = new Wine();

        //встановлюємо значення
        w1.setName("de Baune");
        w1.setDateSpill("01/02/2011");
        w1.setCountry("France");
        w1.setTrademark("de Huebur");
        w1.setNote("message");

        //отримуємо інформацію з классу
        String name = w1.getName();
        String country = w1.getCountry();
        String trademark = w1.getTrademark();
        String note = w1.getNote();

        //визначаємо поточну дату
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);

        //викликаємо метод для розрахунку витримки вина
        long days = w1.calculationOfExposure(d1);

        //виводимо результат на екран
        System.out.println("Витримка вина під назвою " + name + " складає " + days + " днів");
        System.out.println("Його торгова марка " + trademark);
        System.out.println("Країна виробництва: " + country);
        System.out.println("Примітка: " + note);

    }
}
