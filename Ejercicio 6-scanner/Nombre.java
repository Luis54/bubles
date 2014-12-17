import java.util.Scanner;
public class Nombre{
		public static void main(String[]args){
			Scanner in = new Scanner(System.in);
			System.out.println("introduce un valor : ");
			String entrada = in.next(); //recoge el valor introducido //recoje un string
			int numero = in.nextInt(); //recoje un entero
			double numero2 = in.nextDouble(); //recoje un double
			String entrada2 = in.nextLine(); //recoje un linea
			System.out.println ("Has introducido " +entrada+ " " +numero+ " " +numero2);
			System.out.println ("Linea " +entrada2);
			in.close();*/
			//cuando acaba de usar el escaner lo cierro
			//nuevo escaner
			Scanner in1= new Scanner(System.in);
			System.out.println("introduce un valor : ");
			//vamos a contar cuantas veces introducimos el numero 1
			int contador=0;
			while(true){
					String palabra=in1.next();//palabra recoge introducido en el scanner
					if (palabra.equals("1"))
						contador++;
					if (palabra.equals("salida")) //en el momento de recibir salida 
						break; //ejecutamos el break
					}
					System.out.println("Has introducido 1: " +contador+ "veces");
					in1.close();
	}	
}
