//Ejercicio 4
//clase plural que nos crea
//palabras en plural
import java.util.Scanner;
public class Plural{
	private String palabra;
	
	public Plural(String palabra){
		this.palabra=palabra;
	}
	
	//metodo que devuelve el plural
	public String devuelvePlural(){
		if (this.palabra.endsWith("a") || this.palabra.endsWith("e") || this.palabra.endsWith("i") || this.palabra.endsWith("o") || this.palabra.endsWith("u") || this.palabra.endsWith("á") || this.palabra.endsWith("é") ||  this.palabra.endsWith("ó"))
			return this.palabra+"s";
		else if 	(this.palabra.endsWith("í") || this.palabra.endsWith("ú"))
			return this.palabra+"s o "+this.palabra+"es";
		else if (this.palabra.endsWith("ay") && this.palabra.endsWith("ey") || this.palabra.endsWith("oy") ||this.palabra.endsWith("iy") || this.palabra.endsWith("uy"))
			return this.palabra+"es";
		else if (this.palabra.endsWith("l") || this.palabra.endsWith("r") || this.palabra.endsWith("n") || this.palabra.endsWith("d") ||
		this.palabra.endsWith("j"))
			return this.palabra+"es";
		else if (this.palabra.endsWith("z"))
			return this.palabra.substring(0,this.palabra.length()-1)+"ces";
		else
				return this.palabra;
	}
}
class SimulacionPlural{
		public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String palabra;	
		palabra=in.next();
		Plural p = new Plural(palabra);
		System.out.println(p.devuelvePlural());
		in.close();
	
	
	
	
	
	
	}
}
