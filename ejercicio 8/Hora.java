import javax.swing.JOptionPane;
public class Hora{
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora(int h,int m,int s){
		this.hora=h;
		this.minutos=m;
		this.segundos=s;
	}
	public int getHora(){
			return this.hora;
	}
	public int getMinutos(){
			return this.minutos;
	}
	public int getSegundos(){
			return this.segundos;
	}
	
	public void Horas(){
	if(this.hora <=24 || this.hora <=0) 
		JOptionPane.showMessageDialog(null,"Es una hora valida " );
	else
		JOptionPane.showMessageDialog(null,"No es una hora valida" );
		
	}
	
	public void Minutos(){
	if(this.minutos <=60 | this.minutos <=0) 
		JOptionPane.showMessageDialog(null,"Es un minuto valido ");
	else
		JOptionPane.showMessageDialog(null,"No es un minuto valido");
		
	}
	
	public void Segundos(){
	if(this.segundos <=60 | this.minutos <=0) 
		JOptionPane.showMessageDialog(null,"Es un segundo valido ");
	else
		JOptionPane.showMessageDialog(null,"No es un segundo valido");
		
	}	
	
}
class TestHora{
		public static void main(String[]args){
		String hora1 = JOptionPane.showInputDialog("Introduce una hora");	
		int h = Integer.parseInt(hora1);
		String minutos1 = JOptionPane.showInputDialog("Introduce unos minutos");	
		int m = Integer.parseInt(minutos1);
		String segundos1 = JOptionPane.showInputDialog("Introduce unos segundos");	
		int s = Integer.parseInt(segundos1);
		Hora ho = new Hora(h,m,s);
		JOptionPane.showMessageDialog(null,"La hora introducida es " +ho.getHora()+":"+ho.getMinutos()+":"+ho.getSegundos());
		ho.Horas();
		ho.Minutos();
		ho.Segundos();
	
	
	
	}
}
