//Ejercicio 11
//test para comprobar el funcionamiento
public class TestDia{
		public static void main(String[] args){
		Dia d1 = new Dia(DiasSemanas.MARTES);
		System.out.println("Dia de partida: "+d1);
		//d1.queDia(125) debe devolver un nuevo dia de tipo Dia
		int numeroDias=125;
	Dia d2 = d1.queDia(125);
	System.out.println("Dia despues de "+numeroDias+" dias es: "+d2);

	}
	
}	
