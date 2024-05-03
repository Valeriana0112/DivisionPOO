import java.util.Scanner; 

public class MainDivision { 
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Division div = new Division();
System.out.println("INGRESA EL PRIMER NUMERO:");
div.setA (sc.nextDouble());
System.out.println("INGRESA EL SEGUNDO NUMERO:");
div.setB (sc.nextDouble());       
System.out.println(div.division());
System.out.println(div.toString());
div.getA();
div.getB();
}

}