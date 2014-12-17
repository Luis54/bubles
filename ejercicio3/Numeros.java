public class Numeros{
	private int digito;
	
	public int getDigito(){
			return this.digito;
	}	
	public void setDigito(int d){
		this.digito=d;
	}
	public void ImprimeNumeros(){
		for (int i=0; i<=this.digito;i++){ 
		System.out.printf("%-4d%n" , i); //imprime cuatro espacios y alinea
		}
	}
	public void divisible(){
	if (this.digito%10==0)
			System.out.println("Divible por 10");
	else if(this.digito%5==0)	
			System.out.println("Divible por 5");
	else if(this.digito%2==0)	
		System.out.println("Divible por 2");
	else 
			System.out.println("No es divisible ni por 10,5 o 2");
	}
	
	public void esMayorMenorIgualCien(){
			if(this.digito >100)
				System.out.println("Mayor a 100");
			else if (this.digito <100)
				System.out.println("Mayor a 100");
			else
				System.out.println("Igual ue cien");			
		}	
	public void Divisores(){
		if(this.digito >=100)
			System.out.println("Numero mayor que cien");
		else {
			int contador=1;
			while(contador <=this.digito){	
				if(this.digito%contador==0){
					System.out.println(contador+ "Es divisoble de " +this.digito );
					contador++;
				}		
			}
		}		
	
	
	}	
}
class TestNumeros{
		public static void main(String[] args){
		if (args.length ==0){
			 System.out.println("No has pasado argumentos"); 
			 System.exit(1);
		}	 
		Numeros n = new Numeros();
		int num = Integer.parseInt(args[0]);	
		n.setDigito(42);
		n.ImprimeNumeros();
		n.divisible();
		n.esMayorMenorIgualCien();
		n.Divisores();
	}		
}
