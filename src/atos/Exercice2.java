package atos;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer un nombre : ");
        int userEntry = scanner.nextInt();
        double log = 1;
        
        System.out.println("nombre log :");
        int logNumber = scanner.nextInt();
        
        double i = 1;
        
        while(i < logNumber) {
            if(i % 2 == 0) {
                log = log - (1/i);
            }else {
                log = log + (1/i);
            }
            i++;
        }
        
        System.out.println("le logarithme de " + userEntry + " est : " + log);
	}

}
