import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Gift();
    }

    public static void Gift() {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formedGift = false;
        int totalPrice = 0;
        int totalWeight = 0;
        System.out.println("'1' - Twix ");
        System.out.println("'2' - Мармеладные бобы");
        System.out.println("'3' - Собрать подарок");
        Scanner scanner = new Scanner(System.in);
        while (!formedGift) {


            System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    Candy candyTwix = new Candy("Конфеты Twix", 250, 125, "С печеньем внутри");
                    sweets.add(candyTwix);
                    totalPrice += candyTwix.getPrice();
                    totalWeight += candyTwix.getWeight();
                    System.out.println("Конфеты Twix добавлены в подарок");
                    break;
                case 2:
                    Jellybean bean = new Jellybean("Мармеладные бобы", 500, 100, "Прилепают к зубам");
                    sweets.add(bean);
                    totalPrice += bean.getPrice();
                    totalWeight += bean.getWeight();
                    System.out.println("Мармеладные бобы добавлены в подарок");
                    break;
                case 3:
                    formedGift = true;
                    break;
            }


        }
        int count = 0;
        System.out.println();
        System.out.println("Подарок состоит из:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getAdditionalInformation());
        }
        System.out.printf("\nВес подарка: %s гр.\nСтоимость подарка: %s руб.", totalWeight, totalPrice);
    }

}