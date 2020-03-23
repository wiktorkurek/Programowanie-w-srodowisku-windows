import java.util.Scanner;
public class Zadanie2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String number= scanner.next();
            int iterator = 0;

            for(int i = 0; i < number.length()-2; i++){
                if(number.charAt(i) == '1'){
                    for(int j = i + 1; j < number.length(); j++){
                        if(number.charAt(j) == '1'){
                            if(j - i > 1){
                                iterator++;}
                            break;
                        }
                    }
                }
            }
            System.out.println(iterator);
        }
    }
