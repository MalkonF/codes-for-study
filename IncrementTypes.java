public class IncrementTypes
{
   public static void main(String[] args)
   {   
   
      int var = 5; 
      System.out.printf("c before postincrement: %d%n", var); 
      System.out.printf("    postincrementing c: %d%n", var++); //primeiro a var é avaliada depois acontece o incremento
      System.out.printf(" c after postincrement: %d%n", var); 

      System.out.println(); // skip a line

      // demonstrate prefix increment operator
      var = 5; 
      System.out.printf(" c before preincrement: %d%n", var); 
      System.out.printf("     preincrementing c: %d%n", ++var);
      System.out.printf("  c after preincrement: %d%n", var); 
   } 
}
