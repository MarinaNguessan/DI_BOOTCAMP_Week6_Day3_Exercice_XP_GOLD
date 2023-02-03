package atos;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		
		
		 
		    Scanner scanner = new Scanner(System.in);
	        System.out.println("vous allez entrer un suite de nombre selon votre choix, si vous en avez marre appuyer sur entrer");
	        int userNbre = scanner.nextInt();
	        int nbrePos = 0;
	        int nbreNeg = 0;
	        int nbreZero = 0;
	        
	        while(String.valueOf(userNbre).length() != 0) {
	            if(userNbre > 0) {
	                nbrePos++;
	            } else if(userNbre < 0) {
	                nbreNeg++;
	            }else {
	                nbreZero++;
	            }
	            System.out.println("saisissez un nombre : ");
	            userNbre = scanner.nextInt();
	        }
	        System.out.println("le nombre de nombre positive est : " + nbrePos + 
	                "le nombre de nombre négative est : " + nbreNeg +
	                "le nombre de zero rentré est : " + nbreZero);
	}

}
