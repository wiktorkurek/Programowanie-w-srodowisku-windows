
import java.util.*;

        public class Zadanie3 {
        public static void menu() {
        System.out.println("1. Dodaj element do zbioru");
        System.out.println("2. Suma zbiorow");
        System.out.println("3. Roznica zbiorow");
        System.out.println("4. Iloczyn zbiorow");
        System.out.println("5. Roznica symetryczna zbiorow");
        System.out.println("0. Zakoncz");
        System.out.print("Wybor: ");
        }

        public static Set<Integer> sumSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> sum = new TreeSet<>();
        sum.addAll(set1);
        sum.addAll(set2);

        return sum;
        }

        public static Set<Integer> diffSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diff = new TreeSet<>();
        Set<Integer> product = productSet(set1, set2);

        for (Integer value1:set1) {
        boolean isValue=false;
        for (Integer value2:product) {
        if(value1==value2)
        isValue=true;
        }
        if(!isValue)
        diff.add(value1);
        }
        return diff;
        }

        public static Set<Integer> productSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new TreeSet<>();
        for (Integer value1:set1) {
        for (Integer value2:set2) {
        if(value1==value2)
        newSet.add(value1);
        }
        }
        return newSet;
        }

        public static void showSet(Set<Integer> set, String action) {
        System.out.print(action+" zbiorów A i B to: ");
        for (Integer item:set) {
        System.out.print(item+" ");
        }
        }

        public static void main(String[] args) {
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for(;;) {
        menu();
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
        case 1:
        System.out.print("Do ktorego zbioru chcesz podać wartosci? (A lub B): ");
        String chooseSet = input.next();
        if(chooseSet.toUpperCase().equals("A") || chooseSet.toUpperCase().equals("B")) {
        System.out.print("Podaj wartosci do zbioru "+chooseSet+": ");
        String valueS = input.next();
        Scanner scannerValue = new Scanner(valueS).useDelimiter(",");
        while (scannerValue.hasNextInt()) {
        if(chooseSet.toUpperCase().equals("A"))
        setA.add(scannerValue.nextInt());
        else if (chooseSet.toUpperCase().equals("B"))
        setB.add(scannerValue.nextInt());
        }
        } else
        System.out.println("Brak podanego zbioru");
        break;
        case 2:
        Set<Integer> sumAB = sumSet(setA, setB);
        showSet(sumAB, "Suma");
        break;
        case 3:
        Set<Integer> diffAB = diffSet(setA, setB);
        showSet(diffAB,"Roznica");
        break;
        case 4:
        Set<Integer> productAB = productSet(setA, setB);
        showSet(productAB,"Iloczyn");
        break;
        case 5:
        Set<Integer> sum = sumSet(setA, setB);
        Set<Integer> product = productSet(setA, setB);
        Set<Integer> diff = diffSet(sum, product);

        showSet(diff, "Roznica symetryczna");
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