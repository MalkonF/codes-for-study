
import java.math.BigDecimal;
import java.text.NumberFormat;

public class DecimalBig {

    public static void main(String args[]) {

        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount
                    = principal.multiply(rate.add(BigDecimal.ONE).pow(year));//Expressão rate.add add 1 a rate(1.05). pow é chamado p elevar 1.05 a potencia year , o resultado é multiplicado por principal

            System.out.printf("%4d%20s%n", year,
                    NumberFormat.getCurrencyInstance().format(amount));
            //Returns a currency format for the current default locale.
        }
    }
} 

//Nenhum arredondamento ocorre na classe BigDecimal, mas vc pode especifcar o modo de arredondamento para BigDecimal fornecendo um objeto MathContext p o construtor da classe BigDecimal ao criar um BigDecimal.
