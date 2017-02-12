package CLASES;



public class EjemploHilo extends Thread{
  //la variable mensaje es un parámetro que le asignaremos el área que estamos procesando
String mensaje;
 
public EjemploHilo(String mensaje) {
  this.mensaje=mensaje;
 
}
//La funcion run ejecuta los hilos
 
    public void run()
{
 
  for(int i =1;i<=20;i++)
  {
 
   //Mostramos el área que se esta procesando
                                 System.out.println(mensaje+" "+i);
 
                        //Mostramos un aviso de que el hilo se termino de procesar
                        System.out.println("El proceso:"+" "+i+" finalizo");
 
  }
  }
 
//    public void AsignarMensaje(String mensaje)
//{
// 
//this.mensaje = mensaje;
//}  
}
