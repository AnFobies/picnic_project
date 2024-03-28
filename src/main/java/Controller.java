import java.io.IOException;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    public void start() throws IOException {
        int choise = 0;
        while(choise != 5){
            System.out.println("Привет! Это приложение 'Пикник'. Подскажите, что вы хотите сделать?\n" +
                    "1) Посмотреть сколько всего фруктов в корзине\n" +
                    "2) Найти самое длинное название фрукта в корзине\n" +
                    "3) Посмотреть сколько конкретных фруктов у нас есть в формате 'Фрукт: Количество'\n" +
                    "4) Найти самый популярный фрукт\n" +
                    "5) Выйти из проложения");
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println(new Command().howManyFruits());
                    break;
                case 2:
                    System.out.println(new Command().theLongestName());
                    break;
                case 3:
                    new Command().seeAllFruits();
                    break;
                case 4:
                    System.out.println(new Command().mostPopularFruit());
                    break;
            }
        }
    }
}
