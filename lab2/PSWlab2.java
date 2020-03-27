package pswlab2;
import java.util.*;

public class PSWlab2 {
        
    public static void main(String[] args) {
        Cw1 cw1= new Cw1();
        Cw2 cw2 = new Cw2();
        Scanner scan = new Scanner(System.in);
        
        boolean w=true;
        int choose=0;
        while(w){
            System.out.println("Wybierz ktore cwiczenie wlaczyc:");
            System.out.println("1. Cwiczenie1");
            System.out.println("2. Cwiczenie2");
            System.out.println("3. Wyjscie z programu");
            System.out.print("Podaj swoja opcje: ");

            choose=scan.nextInt();
            switch(choose){
                case 1:
                    cw1.MainM();
                    break;
                case 2:
                    cw2.MainM();
                    break;
                case 3:
                    w=false;
                    break;
            }
        }
        
    } 
}
