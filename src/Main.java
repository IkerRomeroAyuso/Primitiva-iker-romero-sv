import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random alea = new Random();
        Scanner sc = new Scanner(System.in);

        String arrayPrimitiva[] = new String[6];
        for ( int i = 0; i < arrayPrimitiva.length; i++){
            int numAle = alea.nextInt(100);
            arrayPrimitiva[i] = String.valueOf(numAle) ;
        }
    for (int i = 0; i < arrayPrimitiva.length; i++){
        System.out.println(arrayPrimitiva[i]);
    }
        System.out.println("Dame un num");
        String cadUsuario = sc.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame un num1");
        String cadUsuario1 = sc.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario1.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame un num2");
        String cadUsuario2 = sc.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario2.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }

        for (int i = 0; i < arrayPrimitiva.length; i++){
            System.out.println(arrayPrimitiva[i]);
        }


    }
}