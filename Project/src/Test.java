import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Transfer ToIbs = new ToIbs();
		Transfer ToKg = new ToKg();
		Scanner s = new Scanner(System.in);
		
		    System.out.println("                         ^^  Welcome  ^^");
		    System.out.println("           we will help you Convert from Kilo to Pounds and vice versa");
		    System.out.println("        write down the number next to your convertion choice");
		    System.out.println("           1 - Kg to Ibs                 2 - Ibs to Kg");
		    System.out.println("     ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		    
		    int Choice = s.nextInt();
		    
		    switch(Choice) {
		    
		    case 1:
		    	System.out.println("Kg to Ibs");
		    	System.out.println("write down the number in Kg");
		        int Kg = s.nextInt();
		        System.out.println(Kg +" = "+ToIbs.Trans(Kg)+" Ibs");
		        
		    	break;
		    case 2:
		    	System.out.println("Ibs to Kg");
		    	System.out.println("write down the number in Ibs");
		        int Ibs = s.nextInt();
		        System.out.println(Ibs +" = "+ToKg.Trans(Ibs)+" Kg");
		    	
		    	break;
		    	
		    	
		    }
	}

}
