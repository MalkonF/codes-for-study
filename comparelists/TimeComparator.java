package comparelists;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
// Compara 2 objetos Time2
import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> //implementa Comparator para comparar dois objetos Time2
{

    @Override //declara método compare da interface implementada
    public int compare(Time2 time1, Time2 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();

        if (minuteDifference != 0) {
            return minuteDifference;
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}
//Aqui está adaptando a classe p comparar objetos Time2 para sabe q uma hora é menor, maior ou igual p ele poder classificar
/*A regra p quem vai sobreescrever compare:
Retorna um inteiro negativo se o primeiro arg for menor q o segundo, 0 se os arg forem iguais ou um inteiro positivo se o primeiro arg for maior q o segundo. */
