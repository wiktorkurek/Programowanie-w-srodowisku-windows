package pswlab2;
import java.util.*;


public class Cw1 {
    void MainM(){
    Scanner scan= new Scanner(System.in);
    Random random = new Random();
    boolean w=true;
    
    System.out.print("Uzytkowniku podaj dlugosc tablicy: ");
    int width=scan.nextInt();
    
    double[] dane={2, 3, 3.5, 4, 4.5, 5};
    double[] uWidth= new double[width];
    
    for(int i=0;i<uWidth.length;i++){
        int randomN=random.nextInt(dane.length);
        uWidth[i]=dane[randomN];
    }
    
    while(w){
        System.out.println("Wybierz opcje ktora cie interesuje: ");
        System.out.println("1. Dane w tablicy");
        System.out.println("2. Srednia wartosc tablicy");
        System.out.println("3. Minimalna i maksymalna wartosc tablicy");
        System.out.println("4. Wartosci wyzsze/nizsze od sredniej z tablicy");
        System.out.println("5. Odchylenie standardowe tablicy");
        System.out.println("6. Wyjdz do glownego menu.");
        System.out.print("Podaj opcje ktora wybierasz: ");
        int choose=scan.nextInt();
        
        switch(choose){
            case 1:
                System.out.print("Twoja tablica zawiera nastepujace dane: ");
                for(double x: uWidth){
                     System.out.print(x+" ");
                }
                 System.out.println("");
                break;
                
            case 2:
                Average(uWidth);
                break;
                
            case 3:
                MinMax(uWidth);
                break;
                
            case 4:
                AUAverage(uWidth);
                break;
                
            case 5:
                Deviation(uWidth);
                break;
                
            case 6:
                w=false;
                break;
            
        }
    }
    
}
    double Average(double[] uWidth){
        double average=0;
        for(int i=0;i<uWidth.length;i++){
            average+=uWidth[i];
        }
        average/=uWidth.length;
        System.out.println("Srednia wartosc z tablicy wynosi: "+ average);
        return average;
    }
    
    void MinMax(double[] uWidth){
        double min = Arrays.stream(uWidth).min().getAsDouble();
        double max = Arrays.stream(uWidth).max().getAsDouble();
        
        System.out.println("Minimalna wartosc tablicy wynosi: "+min);
        System.out.println("Minimalna wartosc tablicy wynosi: "+max);
    }
    
    void AUAverage(double[] uWidth){
        double average = Average(uWidth);;
        List above = new ArrayList();
        List under = new ArrayList();
        
        for(int i=0;i<uWidth.length;i++){
            if (uWidth[i] < average)
                under.add(uWidth[i]);
            else if (uWidth[i] > average)
                above.add(uWidth[i]);

        }
        
        System.out.println("Dane wieksze od sredniej: " + above);
        System.out.println("Dane mniejsze od sredniej: " + under);
    }
    
    void Deviation(double[] uWidth){
        double average = Average(uWidth);
        double Deviation = 0;
        double Deviation2 = 0;

        for (int i = 0; i < uWidth.length; i++) {
            Deviation2 = uWidth[i] - average;
            Deviation += Math.pow(Deviation2, 2);
        }

        Deviation /= uWidth.length;
        Deviation = Math.sqrt(Deviation);

        System.out.println("Odchylenie standardowe wynosi: " + Deviation);
    }
}
