public class RegularPolygon {
   public String name;
   public int egdeAmount;
   public double egdeLength;
   public RegularPolygon(){
      this.name = "";
      this.egdeAmount = 3;
      this.egdeLength = 1;
   }
   public RegularPolygon(String name, int edgeAmount, double edgeLength){
      this.name = name;
      this.egdeAmount = edgeAmount;
      this.egdeLength = edgeLength;
   }
   public RegularPolygon(String name, int edgeAmount){
      this.name = name;
      this.egdeAmount = edgeAmount;
      this.egdeLength  = 1;
   }
   public RegularPolygon(RegularPolygon polygon){
      this.egdeAmount = polygon.egdeAmount;
      this.egdeLength = polygon.egdeLength;
      this.name = polygon.name;
   }
   public String getName(){
      return this.name;
   }
   public int getEdgeAmount(){
      return this.egdeAmount;
   } 
   public int getEdgeLength(){
      return (int) this.egdeLength;
   }
   public void setName(String name){
      this.name = name;
   }
   public void setEdgeAmount(int num){
      this.egdeAmount = num;
   }
   public void setEdgeLength (double length){
      this.egdeLength = length;
   }
   public String getPolygon(){
      switch (this.egdeAmount) {
         case 3:
            return "Triangle";    
         case 4:
            return "Quadrangle";
         case 5:
            return   "Pentagon";
         case 6:
            return "Hexagon";
         default:
            return "Polygon has the number of edges greater than 6";
      }
   }
   public double getPerimeter(){
      double perimeter = egdeLength * egdeAmount;
      return perimeter;
   }
   public double getArea(){
      double area = egdeLength*egdeLength;
      switch (this.egdeAmount) {
         case 3:
            return area*0.433;    
         case 4:
            return area*1;
         case 5:
            return  area*1.72;
         case 6:
            return area*2.595;
         default:
            return -1;
      }
   }
   public String toString(){
      return this.name + " - " + getPolygon() + " - " + getArea();
   }
}
