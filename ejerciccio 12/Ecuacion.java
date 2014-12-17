//ejercicio 12
//clase que representa un
//sistema de dos ecuaciones
//con dos incognitas
// a * x+b * y =e
// c * x+d * y =f
public class Ecuacion{
		//atributos: los coeficientes a,b,c,d,e y f
		private double a,b,c,d,e,f;
	public Ecuacion(double a ,double b ,double c ,double d,double e,double f){
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	this.e=e;
	this.f=f;	
	}
	//metodo que nos dice si es resoluble o no el sistema
	//a * d - b * c es distinto de 0 es la condicion para ser resoluble 
	public boolean esResoluble(){
	
	return ((this.a*this.d)-(this.b*this.c)) !=0;	
		
	}
	
	//metodo que obtiene el valor de x	
	// x = (e*d-b*f) / (a*d-b*c)
	
	public double solucionX(){
		return (this.e*this.d-this.d*this.f) / (this.a*this.d-this.b*this.c);
			
	//metodo que obtiene el valor y
	// y = (a*f-e*c) / (a*d-b*c)	
	}
	public double solucionY(){
		return (this.a*this.f-this.e*this.c) / (this.a*this.d-this.b*this.c);
				
	}
	@Override
	public String toString(){
	return (this.a+"*x + "+this.b+"*y ="+this.e+
			"\n"+this.c+"*x +"+this.d+"*y ="+this.f);	
		
	}	
		
}
class TestEcuacion{
		public static void main (String[]args){
			
		Ecuacion e1 = new Ecuacion(1,1,2,2,1,2);
		Ecuacion e2 = new Ecuacion(2,1,-1,2,7,-1);
		System.out.println(e1);
		if(e1.esResoluble()){
			System.out.println("Es resoluble,soluciones:");
			System.out.println(e1.solucionX());
			System.out.println(e1.solucionY());
		}else{
				System.out.println("No es resoluble");
		}		
		System.out.println(e2);
		if(e2.esResoluble()){
			System.out.println("Es resoluble , soluciones");
			System.out.println(e2.solucionX());
			System.out.println(e2.solucionY());
		}else{
				System.out.println("No es resoluble");
		}


	
	}	


}	
	
	
		
