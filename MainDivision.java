import java.util.Scanner; // se importa el Scanner 

public class MainDivision { //dar el nombre de la clase main
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);// utilizamos un scanner para leer las variables ya que nos perimite odtner la entra a datos primitivos 

        System.out.println("introduzca primer valor");// Se imprime un mensaje en donde se le indica al usuario que ingrese un valor
        double a = reader.nextDouble();// la variable del scanner reader 
        System.out.println("introduzca segundo valor");
        double b = reader.nextDouble();// la variable del scanner reader 
        //double r = a / b //se declara la variable con la operacion que se desea realizar 
       Division def = new Division();
        def.a=a;
        def.b=b;
        System.out.println("El resultado es:" + def.Dividir());
    }
}