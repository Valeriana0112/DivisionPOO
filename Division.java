
public class Division {  
    @Override
   public String toString() {
      return "Division [a=" + a + ", b=" + b + ", r=" + r + "]";
   }

    private double  a, b, r;
    public double division() {
      r = this.a / this.b;
      return r;
    }

   public double getA() {
      return a;
   }

   public void setA(double a) {
      this.a = a;
   }

   public double getB() {
      return b;
   }

   public void setB(double b) {
      this.b = b;
   }

   public double getR() {
      return r;
   }

   public void setR(double r) {
      this.r = r;
   } 
}


 
   