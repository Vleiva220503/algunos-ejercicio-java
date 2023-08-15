public class CalcularEd
{
 
int Fecha;

public CalcularEd(){}

public CalcularEd(int Fecha){
this.Fecha=Fecha;
}

public void setFecha(int Fecha){this.Fecha=Fecha;}

public int getFecha(){return Fecha;}

public int registroNacimiento(){
return 2022 - getFecha();
}

public void mostrar(){
 System.out.println("La edad del usuario es:"+registroNacimiento());
}
}