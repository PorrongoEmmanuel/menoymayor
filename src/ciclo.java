
import  java.util.Scanner;
public class ciclo {



    public static void main(String[]args) {
        int aux1;


        int arreglo[] = {5, 6, 7, 1000, -78, 65, 100, 4566, -100000};

        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {
                    aux1 = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux1;
                }
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]" + " ");
        }




                }
            }

