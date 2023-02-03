package atos;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

        
        System.out.println("entrer un nombre : ");
        Scanner sc = new Scanner(System.in);
        int userEntry = sc.nextInt();
        
        int nbre1 = 0;
        int nbre2 = 1;
        int fib;
        System.out.println(nbre1);
        System.out.println(nbre2);
        for(int i = 1; i < userEntry; i++) {
            fib = nbre1 + nbre2;
            nbre1 = nbre2;
            nbre2 = i;
            System.out.println(fib);
        }
        
       

	}

}
