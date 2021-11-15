package intro;

import java.util.Random;
import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		 Random random = new Random();
		 
		 System.out.println("Kaç kolon oynanacak?");
		 int kolonSayi = s.nextInt();
		 
		 int kolon[][] = new int[kolonSayi][6];
		 

		 for(int i=0; i<kolonSayi; i++ ){
		     for(int j=0;j<6;j++ ){
		    	 
		    	 int n = random.nextInt(49)+1;
		    	 
		         if(n!=kolon[i][j]){ 
		         kolon[i][j]=n;
		         }
		     }
		 }
		 for(int i=0; i<kolonSayi; i++ ){
		     System.out.println("");

		     for(int j=0;j<6;j++ ){
		        
		         System.out.print(kolon[i][j] + "  ");
		        
		     }
		 }

	}

}
