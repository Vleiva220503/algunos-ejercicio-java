public class Ejercicio2
{

	double CalSubTot;

	public  Ejercicio2(){}

	public Ejercicio2(double CalSubTot){
	  this.CalSubTot=CalSubTot;
	}

	public void setCalSubTot(double CalSubTot){this.CalSubTot=CalSubTot;}

	public double getCalSubTot(){return CalSubTot;}

	public double CalcularIva(){
		return getCalSubTot()*0.15;
	}
	

	public  void mostrar(){
       
   	System.out.println("El subtotal del iva es: "+CalcularIva());
	System.out.println("EL subtotal es: "+getCalSubTot());
	}
}