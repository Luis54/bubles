import java.util.Scanner;
public class NumerosDecimales{
	public static void main(String[]args){
	Scanner d = new Scanner (System.in);
	System.out.println("Introduce 12 numeros decimales");
	double numero1 = d.nextInt(); 
	double numero2 = d.nextInt(); 
	double numero3 = d.nextInt(); 
	double numero4 = d.nextInt(); 
	double numero5 = d.nextInt(); 
	double numero6 = d.nextInt(); 
	double numero7 = d.nextInt(); 
	double numero8 = d.nextInt(); 
	double numero9 = d.nextInt(); 
	double numero10 = d.nextInt(); 
	double numero11 = d.nextInt(); 
	double numero12 = d.nextInt(); 
	double media =numero1+numero2+numero3+numero4+numero5+numero6+numero7+numero8+numero9+numero10+numero11+numero12/12;
	System.out.println("Valor de la medias es :" +media);
	System.out.printf("%-4.2f",+numero1+"  " +numero2+"  "+numero3+"  "+numero4+"  "+numero5+"  "+numero6+"  "+numero7+"  "+numero8+"  "
	+numero9+"  "+numero10+"  "+numero11+"  "+numero12);
	
	
	}
	
}
