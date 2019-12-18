package interfaces;

public interface Payable {

    double getPaymentAmount();
}

//Uma interface é usada tb qnd precisa relacionar classes distintas, para q uma chame o metodo da outra.
/*Interfaces tb podem conter métodos com implementação desde que use a palavra default. A implementação
feita na interface será usada qnd o método n for implementado na classe que implementa a interface*/

 /*Uma interface costuma ser usada no lugar de classe abstrata qnd n há nenhuma implmentação padrão a herdar -
isto é, nenhum campo e nenhuma implementação padrão de método*/
