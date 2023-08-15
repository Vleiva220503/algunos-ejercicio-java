import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FuncionPri{

public static double subTot;
public static Ejercicio2 t=new Ejercicio2();

public static void main(String args[]){
InputStreamReader leer=new InputStreamReader(System.in);
BufferedReader g=new BufferedReader(leer);
try{
do{

System.out.println("Digite el su sub ingresos:");
subTot=Double.parseDouble(g.readLine());
t.setCalSubTot(subTot);
if (subTot<1 || subTot >10000)
System.out.println("Digite el sub ingreso en el rango de 1 a 10000 ");

}while(subTot<1 || subTot>10000);

}catch(IOException ex){subTot=0.0;}
t.mostrar();

}
}