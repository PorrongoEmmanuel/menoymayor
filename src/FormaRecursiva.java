import  java.util.Scanner;

public class FormaRecursiva {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int m = 0;
        System.out.print("Ingrese cantidad de numeros para el arreglo:");
        int tamano = read.nextInt();
        int[] arreglo = new int[tamano];
        System.out.println("Ingrese los valores:");

        for (int i = 0; i < tamano; i++) {
            arreglo[i] = read.nextInt();
        }
        for (int i = 0; i < tamano; i++) {//caso base
            for (int j = 0; j < tamano; j++) {
                if (arreglo[i] < arreglo[j]) {
                    m = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = m;
                }
            }
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print("["+arreglo[i]+"]" + " ");
        }


    }
}



