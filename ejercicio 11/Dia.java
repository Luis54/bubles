//Ejercicio 11,Nueva Version
//donde no definomos el enum
//dentro de la misma clase
//y el test lo vamos a definir en otro clase independiente
public class Dia{
	private DiasSemanas dia;
	
	public Dia(DiasSemanas d){
		this.dia=d;
		
	}
	@Override
	public String toString(){
		return this.dia.toString();
	}
	
	//metodo que dado el numero de dias (int d)
	//devolver un nuevo dia(de tipo Days)
	public Dia queDia(int d){
		Dia diaRetorno;
		//debo obtener la cardinalidad,sumarle el numero de dias (int d) y hacer el resto de 7 (%7)
		//en funcion de ese valor devolver un tipo de día (Dia diaretorno)
		switch((this.dia.ordinal()+d)%7){
			case 0:
				diaRetorno=new Dia(DiasSemanas.DOMINGO);
				break;
			case 1:
				diaRetorno=new Dia(DiasSemanas.LUNES);
				break;
			case 2:
				diaRetorno=new Dia(DiasSemanas.MARTES);
				break;
			case 3:
				diaRetorno=new Dia(DiasSemanas.MIERCOLES);
				break;
			case 4:
				diaRetorno=new Dia(DiasSemanas.JUEVES);
				break;
			case 5:
				diaRetorno=new Dia(DiasSemanas.VIERNES);
				break;	
			default:
				diaRetorno=new Dia(DiasSemanas.SABADO);
		}	
		return diaRetorno;
		
	}
}
