package animals;

public class MammalInt {
 
   public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
 
   public int noOfLegs(){
      return 0;
   }

   public void show(){
      this.eat();
   }
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
//      super.eat();

   }
}