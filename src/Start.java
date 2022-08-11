import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add=new Scanner(System.in);
		
		int i;
		
		System.out.print("Introduce un número entero: ");
		i=add.nextInt();
		
		if (i % 2 == 0) {
				System.out.println("Par");
				}
			else {
				System.out.print("Ímpar");
			}
		
	}

}
