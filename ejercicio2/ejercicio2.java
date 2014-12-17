public class ejercicio2{
		public static void main(String[]args){
		System.out.println("Un programa que imprima los numeros del 1 al 10");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Un programa que imprima la siguiente serie: 20 25 30 35 . . . 70 75 80");
		int contador=20;
		while(contador <=80){
		System.out.printf("%-5d ",contador);
		contador += 5;//esto es igual que hacer contador=contador+5;	
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Un programa que imprima la siguiente serie: 100 98 96 94 . . . 56 54 52 50");		
		contador=100;
		do{
		System.out.println(contador);
		contador -= 2;	
		}
		while(contador >=50);	
		System.out.println("-----------------------------------------------");
		System.out.println("Un programa que calcule la suma de los numeros enteros del 1 al 100.");
		int valor3=0;
		for(int i=1;i<=100;i++){
			valor3 +=i;
		}	
		System.out.println(valor3);
		System.out.println("-----------------------------------------------");
		System.out.println("Un programa que calcule la la suma de los cuadrados de los 15 primeros numeros naturales");
		int valor4=0;
		int contador4=0;
		while(contador4 <=15){
			valor4+=contador4*contador4;
			contador4++;
		}	
		System.out.println(valor4);
		System.out.println("-----------------------------------------------");
		System.out.println("Un programa que calcule independientemente la suma de los pares e impares comprendidos entre 1 y 50");
		int sumaPares,sumaImpares =0;
		do{
			
		}	
	}
}	
