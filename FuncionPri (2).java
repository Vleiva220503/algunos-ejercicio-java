import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FuncionPri
{
public static int nacimiento,c;
public static CalcularEd jk=new CalcularEd();

 public static void main(String args[]){
InputStreamReader ht=new InputStreamReader(System.in);
BufferedReader fc=new BufferedReader(ht);

try{
do{

System.out.println("Ingrese su fecha de nacimiento");
nacimiento=Integer.parseInt(fc.readLine());
jk.setFecha(nacimiento);

if(nacimiento<1922 || nacimiento >2022)
System.out.println("Digite una fecha en el rango de 1922 y 2022");

}while(nacimiento<1922 || nacimiento>2022);

}catch(IOException ex){nacimiento=0;}
jk.mostrar();
}
}