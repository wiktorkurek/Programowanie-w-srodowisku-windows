package pswlab2;
import java.util.*;

public class Cw2 {
        void MainM(){
            Scanner scan = new Scanner(System.in);
            Random numbersX = new Random();
            Random numbersY = new Random();
            boolean w =true;
            while(w){
                System.out.println("Podaj liczbe kolumn: ");
                int column = scan.nextInt();
                System.out.println("Podaj liczbe wierszy: ");
                int line = scan.nextInt();
                if ((column / line) == 1 && (line / column) == 1) {
                    int[][] matrixX = new int[column][line];
                    int[][] matrixY = new int[column][line];
                    int[][] matrixResult = new int[column][line];
                    int[] dane = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    for (int l = 0; l < column; l++) {
                        for (int c = 0; c < line; c++) {
                            int randomX = numbersX.nextInt(dane.length);
                            int randomY = numbersY.nextInt(dane.length);
                            matrixX[l][c] = dane[randomX];
                            matrixY[l][c] = dane[randomY];
                        }
                    }
                    
                    while(w){
                        System.out.println("Wybierz opcje ktora cie interesuje: ");
                        System.out.println("1. Pokaz macierz X");
                        System.out.println("2. Pokaz macierz Y");
                        System.out.println("3. Dodaj macierze");
                        System.out.println("4. Odejmij macierze");
                        System.out.println("5. Wymnoz macierze");
                        System.out.println("6. Wyjscie do glownego menu");
                        System.out.print("Podaj opcje ktora wybierasz: ");
                        int choose=scan.nextInt();
                        switch(choose){
                            case 1:
                                System.out.println("Macierz X wygląda następująco:");
                                showM(column, line, matrixX);
                                break;
                            case 2:
                                System.out.println("Macierz Y wygląda następująco:");
                                showM(column, line, matrixY);
                                break;
                            case 3:
                                addM(column, line, matrixX, matrixY, matrixResult);
                                break;
                            case 4:
                                substractionM(column, line, matrixX, matrixY, matrixResult);
                                break;
                            case 5:
                                multiplicationM(column, line, matrixX, matrixY, matrixResult);
                                break;
                            case 6:
                                w=false;
                                break;
                        }
                    }
                }else System.out.println("Podane macierze nie sa kwadratowe");
                
            }
            
    
    }
        
        private void showM(int column, int line, int[][] matrix) {
        for (int l = 0; l < column; l++) {
            for (int c = 0; c < line; c++) {
                System.out.print("[" + matrix[l][c] + "]");
            }
            System.out.print("\n");
        }

    }
        
        private void addM(int column, int line, int[][] matrixX, int[][] matrixY, int[][] resultMatrix) {
        for (int l = 0; l < column; l++) {
            for (int c = 0; c < line; c++) {
                resultMatrix[l][c] = matrixX[l][c] + matrixY[l][c];
            }
        }
        System.out.println("Macierz po dodawaniu: ");
        showM(column, line, resultMatrix);
    }
        
        private void substractionM(int column, int line, int[][] matrixX, int[][] matrixY, int[][] resultMatrix) {
        for (int l = 0; l < column; l++) {
            for (int c = 0; c < line; c++) {
                resultMatrix[l][c] = matrixX[l][c] - matrixY[l][c];
            }
        }
        System.out.println("Macierz po odejmowaniu: ");
        showM(column, line, resultMatrix);
    }
        
        private void multiplicationM(int column, int line, int[][] matrixX, int[][] matrixY, int[][] resultMatrix) {
            int result = 0;
            for (int l = 0; l < column; l++) {
                for (int c = 0; c < line; c++) {
                    for (int x = 0; x < column; x++) {
                    result += matrixX[l][x] * matrixY[x][c];
                    }
                    resultMatrix[l][c] = result;
                    result = 0;
                }
            }
            System.out.println("Macierz po mnozeniu: ");
            showM(column, line, resultMatrix);
    }
    
}
