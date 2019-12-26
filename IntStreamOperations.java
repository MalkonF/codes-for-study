/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamOperations {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        /*Recebe um array int e retorna um IntStream para processar os valores do array pelo método 
      foreach que é terminal. Esse método recebe como arg um obj qu eimplementa a interface funcional 
      IntCosumer. O método accept dessa interface reebe um valor int  realia uma tarefa c ele,
      exibe o valor e um espaço. Antes isso seria implementado dessa maneira:
      
      new IntConsumer()
      {
      public void accept(int value)
      {
      System.out.printf("%d", value);
      }
      }*/
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
        //1 arg valor que acrescentará na soma. 2 arg um obj que implementa a interface funcional 
        //IntBinaryOperator
        System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));

        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y * y));

        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));
        //localiza inteiros pares, classifica e exibe. Aqui filter é uma operação intermediária e preguiçosa
        //ela só é executada depois  q uma operação terminal e executada
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)//intermediaria
                .sorted()//terminal
                .forEach(value -> System.out.printf("%d ", value));//terminal
        System.out.println();
        /*Acha os impar e multiplica cada impar por 10, classidica ordem crescente
        Op intermediaria preguiçosa*/
        System.out.printf(
                "Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1, 10).sum());//produz uma seq valores contendo o 1 num mas n o segundo

        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());//produz sequencia de valores contendo 1 e 2
    }
}
/*fluxos ou streams são objetos das classes que implementam a interface Stream ou uma das interfaces 
de fluxo especializados para tratar coleções de valores int long ou double.

Juntamente com lambdas fluxos permitem realizar tarefas sobre coleções de elementos muitas vezes a 
partir de um objeto Array ou Collection. 

os fluxos movem os seus elementos por meio de uma sequência de passos conhecidos como pipeline de 
fluxos q começa com origem de dados e realiza várias operações intermediárias sobre os elementos da 
origem de dados e termina com operações terminais.

pipeline de fluxo é formado encadeado chamadas de método 

Ao contrário das coleções fluxos não tem o armazenamento próprio. Depois que o fluxo é processado e 
não pode ser reutilizado porque não mantem uma cópia da origem de dados original.

Uma operação intermediária específica as tarefas a realizar sobre os elementos do fluxo e sempre 
resulta em um novo fluxo. Operação intermediária são preguiçosas elas só são executadas após que uma 
operação terminal for invocada. 

Ela permite que desenvolvedores de biblioteca otimize o desempenho do processamento de fluxo presente,
você tem uma coleção de mil objetos Person e está procurando o primeiro obj com o sobrenome de onis o 
processamento de fluxo pode terminar assim que o primeiro obj onis for encontrado. 

Já operações terminais inicia o processamento das operações intermediárias de um pipeline de fluxos
e produza um resultado. 

Operracoes terminais gulosos  realizam a operação solicitada quando são chamados. 
Essas operações são preguiçosas e podem melhorar o desempenho.

As operações terminais elas só são invocadas após você ter uma operação intermediário, por exemplo,
você vai ter uma operação terminal q é calcular média dos elementos no fluxo e após saber 
o resultado você chama o filtro para filtrar cada um de acordo com o que você deseja.

Formas sintaxe lambda:

(lista parametros) -> {instruções}

(int x, int y) -> {return x + y};
(x,y) -> {return x + y}; tipo de parametro omitido
(x, y) -> x + y; return omitido
value -> System.out.println("%d", value); contem 1 parametro e é omitido

O compilador java pode inferir os tipos dos parametros de uma lambda e o tipo encontrado por uma 
lambda a partir do contexto que ela é usada. Isso é determinado pelo tipo da interface funcional que
é esperado onde a lambda aparece no código. Se o tipo for IntCosumer, o tipo do parametro lambda é 
inferido como sendo int, pq o método accept da interface IntConsumer espera receber um int. 
Mas vc pode declarar explicitamente o tipo do parametro como:
(int value) -> System.out.printf("%d", value);

Antes do java SE 8, ao implementar uma classe interna anônima, vc poderia usar as variaveis locais do
método envolvente(escopo léxico), mas deveria declarar essas variáveis locais final. Lambdas tb
podem usar variáveis locais final.  No java se 8 as classes internas anonimas e lambdas tb podem usar var
locais efetivamente final. Uma lambda que referencia uma var local no escopo lexico envolvente é 
conhecida como uma lambda de captura. O compilador captura o valor da var local e assegura q o valor
pode ser usado qnd a lambda for entao executada, o que pode ocorrer depois que o escopo lexico n
exite mais.

Como em uma classe interna anonima, uma lambda pode usar a ref this da classe externa. Em uma classe
interna anonima, vc deve usar a sintaxe NomeDaClasse.this, caso contraio a ref this referencia o obj 
da classe interna anonima. Em uma lambda voce referencia o obj da classe externa simplesmente com this.

Os nomes de parametros e variaveis utilizados em lambdas n podem ser os mesmos que quaisquer outras var
locais no ambito lexico da lambda.

Operações terminais sao gulosas, elas processam imediatamente os itens no fluxo.

Operação intermediária sem estado - ela n requer nenhuma informação sobre outros elementos no fluxo para saber
se o elemento atual atende ao predicado.

Operação intermediária com estado - requer informações sobre todos os outros elementos do fluxo p 
classifica-lo

Compondo expr lambdas - pode ser usado metodos e obj IntPredicate para compor condições mais complexas.

IntPredicate even = value -> value % 2 == 0
IntPredicate greaterThan5 = value -> value >5;

por

even.and(greaterThan5);

and é um metodo default da interface IntPredicate



 */
