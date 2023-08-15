import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FuncionPri{

	public static double salarioUsuario;
	public static int temporada;
	public static PrimerEjercicio sal=new PrimerEjercicio();

	public static void main(String args[]){
	InputStreamReader x=new InputStreamReader(System.in);
	BufferedReader t=new BufferedReader(x);
	try{
	   do{

	System.out.println("Digite su salario: ");
	salarioUsuario=Double.parseDouble(t.readLine());
	}while(salarioUsuario <4800 || salarioUsuario >500000);
	sal.setsalarioUsuario(salarioUsuario);

  	  do{

	System.out.println("Digite su epoca de ingreso: ");
	temporada=Integer.parseInt(t.readLine());
	}while(temporada <1957 || temporada >2022);
	sal.setingresoDeTemporada(temporada);
	}catch(IOException ex){}
	sal.mostrar();

}

}