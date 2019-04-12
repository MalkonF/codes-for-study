public class JurosPorAno 
{
   public static void main(String args[])
   {
      double quantia; 
      double principal = 5000.0; 
      double taxa = 1.0;

      System.out.printf("%s%25s%n", "Ano", "Valor em depósito:");

      for (int ano = 1; ano <= 10; ano++) 
      {
         quantia = principal * Math.pow(1.0 + taxa, ano);

         System.out.printf("%4d%,20.2f%n", ano, quantia);
      } 
   }
}
