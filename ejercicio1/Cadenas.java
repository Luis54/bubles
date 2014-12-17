//Ejercicio 1.1
public class Cadenas{
	public static void main (String[] args){
		System.out.println("ejemplo de contains si tiene la cadena");
		System.out.println("hola" .contains("ol")); //true
		System.out.println("hola" .contains("oa")); //false
		System.out.println("hola" .contains("dd")); //false
		System.out.println("------------------------------");
		System.out.println("ejemplos de endsWith con que letras acaba");
		System.out.println("hola" .endsWith("a")); //true 
		System.out.println("hola" .endsWith("la")); //true
		System.out.println("hola" .endsWith("l"));  //false
		System.out.println("------------------------------");
		System.out.println("ejemplos de startWith con que letras empiezan")	;
		System.out.println("hola" .startsWith("a")); //false
		System.out.println("hola" .startsWith("ho")); //true 
		System.out.println("hola" .startsWith("h")); //true 
		System.out.println("hola" .startsWith("h",0)); //true
		System.out.println("------------------------------");
		System.out.println("ejemplos de isEmpty si la longitud es 0 es true");
		System.out.println("hola".isEmpty()); //false
		System.out.println("" .isEmpty()); //true 
		System.out.println(" " .isEmpty()); //false 
		System.out.println("------------------------------");
		System.out.println("equals compara dos cadenas,pero su contenido");
		String cadena1 = new String ("hola");
		String cadena2= new String ("hola");
		String cadena3="hola";
		String cadena4= "hola";
		String cadena5= "HOLA";
		String cadena6= "hol";
		System.out.println(cadena1==cadena2); //false,comparamos posiciones de memoria
		System.out.println(cadena3==cadena4); //true
		System.out.println(cadena3==cadena2);//false,comparamos posiciones de memoria
		System.out.println(cadena6==cadena4); //false , sinsible a mayuscula y minuscula
		System.out.println(cadena5==cadena4); //false , comparamos posicion de memoria
		System.out.println("ejemplo equals");
		System.out.println(cadena1.equals(cadena2)); //true el contenido es lo mismo
		System.out.println(cadena4.equals(cadena5)); //false el contenido es lo mismo
		System.out.println("------------------------------");
		System.out.println("usando IgnoreCase");
		System.out.println(cadena1.IgnoreCase(cadena2)); //true el contenido es lo mismo
		System.out.println(cadena4.IgnoreCase(cadena5)); //false el contenido es lo mismo
		
				}
	
	}
