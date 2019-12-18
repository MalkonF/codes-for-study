
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    /*Expressão identifica aniversários que n ocorram em abril e que pertençam as pessoas cujos nomes iniciam
    com J*/
    public static void main(String[] args) {
        /*ponto quer dizer qualquer caractere menos nova linha. Aí o * extende isso para todas as casas ao 
        invés de só uma. ou seja Jenif, Jenifffffffffffffffffff*/
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");/*so traz meses que comecam com
        0-3 e 5-9*/

        String string1 = "Jane's Birthday is 05-12-75\n"
                + "Dave's Birthday is 11-04-68\n"
                + "John's Birthday is 04-28-73\n"
                + "Joe's Birthday is 12-17-77";

        Matcher matcher = expression.matcher(string1);//guardou as string que corresponde a expressão

        while (matcher.find()) {//procura pelas strings que deram matche. Cada chamada desse método inicia no ponto
            //que a ultima chamada terminou. Entao multiplas ocorrencias podem ser localizadas
            System.out.println(matcher.group());//retorna a string do obj de pesquisa que corresponde ao padrão
            //de pesquisa
        }
    }
}
/*CharSequence é uma interface que permite acesso de leitura a uma sequência de caracteres. A interface requer
que os métodos charAt, length, subSequence e toString sejam declarados. Tanto String qt StringBuilder implementam
a interface CharSequence, então uma instância de qualquer uma dessas classes pode ser utilizada com a classe
Matcher. A expressão regular pode ser testada contra String e n contra StringBuilder.

Se uma expressão regular vai ser utilizada somente 1 vez, é recomendável utilizar matches. 
Se a expressão regular vai ser utilizada mais de uma vez, em um loop, por exemplo, é mais eficiente
utilizar o método compile para criar um obj Pattern específico para essa expressão regular.Esse método
recebe uma string e retorna um novo obj Pattern que então pode se utilizado para chamar o método matcher.*/
