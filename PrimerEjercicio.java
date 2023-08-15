public class PrimerEjercicio
{

	double salarioUsuario;
	int ingresoDeTemporada;

	public PrimerEjercicio(){}

	public PrimerEjercicio(double salarioUsuario, int ingreso){
	this.salarioUsuario=salarioUsuario;
	this.ingresoDeTemporada=ingresoDeTemporada;
}

	public void setsalarioUsuario(double  salarioUsuario){this.salarioUsuario=salarioUsuario;}
	public void setingresoDeTemporada(int  ingresoDeTemporada){this.ingresoDeTemporada=ingresoDeTemporada;}
	public double getsalarioUsuario(){return salarioUsuario;}
	public int getingresoDeTemporada(){return ingresoDeTemporada;}
	
	public int antiguedadTemporada(){return 2022 - getingresoDeTemporada();}

	public double antiguedadPorcentual(){return ((2 * ingresoDeTemporada) +1) /100;}

	public double antiguedadEconomica(){
	return salarioUsuario * antiguedadPorcentual();}

	public double Ingresotota(){
 	return salarioUsuario + antiguedadEconomica();
	}
	public double salarioUsuario(){
	return salarioUsuario;
	}

	public int ingresoDeTemporada(){
	return ingresoDeTemporada;
}
	public void mostrar(){

	System.out.println("Su antiguedad es de: "+antiguedadTemporada());
	System.out.println("El salario del usuario es: "+salarioUsuario());
	System.out.println("Su temporada de ingreso fue en el: "+ingresoDeTemporada());
	System.out.println("Su antiguedad porcentual es de: "+antiguedadPorcentual());
	System.out.println("Su antiguedad economica es de: "+antiguedadEconomica());
	System.out.println("Sus ingresos totales son: "+Ingresotota());
	}
}