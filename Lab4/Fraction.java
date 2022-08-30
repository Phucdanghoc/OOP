public class Fraction {
   private int numerator,denominator;
   public Fraction(){

   }
   public Fraction(int num,int den){
      numerator = num;
      denominator = den;
   }
   public Fraction(Fraction f){
      this.denominator = f.denominator;
      this.numerator = f.numerator;
   }
   public Fraction add(Fraction f){
      int newNum = f.denominator*numerator + f.numerator*denominator;
      int newDen = f.denominator*denominator;
      Fraction newFra = new Fraction(newNum,newDen);
      newFra.reducer(newNum,newDen);
      return newFra;
   }
   public Fraction sub(Fraction f) {

      int newNum  = f.denominator*numerator - f.numerator*denominator;
      int newDen = f.denominator * denominator;
      Fraction newFra = new Fraction(newNum,newDen);
      newFra.reducer(newNum,newDen);
      return newFra;
   }
   public Fraction mul(Fraction f){
      int newNum = f.denominator*denominator;
      int newDen = f.numerator*numerator;
      Fraction newFra = new Fraction(newNum,newDen);
      newFra.reducer(newNum,newDen);
      return newFra;
   }
   public Fraction div(Fraction f){
      int newNum = f.numerator*denominator;
      int newDen = f.denominator*denominator;
      Fraction newFra = new Fraction(newNum,newDen);
      newFra.reducer(newNum,newDen);
      return newFra;
   }
   public void reducer(int num,int den) {
      int swap;
      while(den != 0) {
         swap = num % den;
         num = den;
         den = swap;
      }
      this.denominator /= num;
      this.numerator /= num;
   }
   public String toString(){
      return "Fraction[num=" + this.numerator + ",den=" + this.denominator + "]";
   }
}
