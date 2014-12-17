import java.util.Scanner;
public class Cifras{
	public static void main(String[]args){
	Scanner n = new Scanner(System.in); 
	System.out.println("Introduce una cifra: ");
	int numero = n.nextInt();
	int tercero;
    int segundo;
    int primero;
    if (numero <=99 || numero >=1000){
			System.out.println("Numero introducido no valido");
			System.exit(1);
	}	
    //residuo de la division
    tercero = numero%10;
    //divide el residuo de la division
    numero = numero/10;
    segundo = numero%10;
    numero = numero/10;
    primero = numero%10;
	System.out.println("El numero introducido primera cifra : " +primero);
	System.out.println("El numero introducido segundo cifra : " +segundo);
	System.out.println("El numero introducido tercera cifra : " +tercero);
	
	
	
	
	
	
	
	}
}
