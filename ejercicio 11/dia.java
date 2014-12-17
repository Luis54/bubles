public class dia{
	public enum Days{
		DOMINGO,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO
	}
	private Days dias;
	
	public dia(Days d){
		this.dias=d;		
	}	
		
	@Override 
	public String toString(){	
		return this.dias;
	}
 }	


