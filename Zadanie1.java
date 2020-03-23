import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Zadanie1{
    public static void menu() {
        System.out.println("1. Podaj liczbe");
        System.out.println("2. Wyswietl liczbe unikalnych wartosci");
        System.out.println("0. Zakoncz");
        System.out.print("Wybór: ");
    }

    public static void main(String[] args) {
        Set<Integer> List = new HashSet<>();
        while(1!=0){

            menu();
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Podaj liczbe: ");
                    int number = input.nextInt();
                    List.add(number);
                    break;
                case 2:
                    System.out.println("Liczba unikatowych elementów: " + List.size());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Zly wybor. Sprobuj ponownie");
                    break;

            }
        }

    }
}