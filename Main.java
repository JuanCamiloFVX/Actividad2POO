import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Nota n1 = new Nota("Fisica" , 0.0,"Julian");
		Nota n2 = new Nota("Castellano" , 0.0,"Julian");
		
		System.out.println("Que matria desea consultar 1: Castellano o 2: Fisica");
		
		int M = scan.nextInt();
			
	try {
		if (M == 1) {
			
			n2.ErrorNota(2.0);
			
		}else {
			
			if (M == 2) {
				
				n1.ErrorNota(-3.0);	
				
		}else {
			System.out.println("No ninguna opcion con ese numero");
			
		}
		}
		
	} catch (Try_Error ex) {
		 System.out.println(" ");
         System.out.println(ex.getMessage());
         
	}finally {
		System.out.println(" ");
        System.out.println("Finalizacion del proceso");
		}
		
		}
	
	}

