package expressoesregulares;

public class ValidateInput {

    /*Essa expressão vai ver se localiza o padrão na string contida em firstName. Se encontrar
      o padrão, retorna true, senão false. [A-Z] corresponde primeiro digito. [] o segundo. Assim como 
      \d corresponde sempre a um digito na string buscada aqui o * tá dizendo, depois da primeira letra maiuscula
      tudo que vier depois do primeira casa se conter letras minusculas ou maiusculas vai dar match*/
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");//localiza qualquer número de letras
        //separadas por espaços, apóstrofos ou hifens.
    }

    public static boolean validateAddress(String address) {
        return address.matches(
                "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");/*localiza qualquer digito uma ou mais vezes 
        em seguida um ou mais caracteres em branco. O caractere | corresponde a expressão a esquerda
        ou a direita para localizar, pode localizar tanto uma qnt outra. Endereço deve conter 1 numero 
        seguido por 1 ou 2 palavras*/
    }

    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");/*qlqr palavra de pelo menos 1 caractere ou
        qualquer  duas palavras de pelo menos um caractere se as palavras forem separadas por um 
        unico espaço*/

    }

    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");//localiza 5x um digito
    }

    public static boolean validatePhone(String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
/*Uma classe de caractere é uma sequência de escape que representa um grupo de caracteres. Para
localizar um conjunto de caracteres que não tem uma classe de caracteres predefinida, utilize os
colchetes.Por exemplo, [aeiou] localiza vogais. O intervalo de caracteres podem ser representados
colocando um -. 
Se for precedido por um ^ vai identificar qualquer caractere diferente desses indicados.
[^Z] não é o mesmo que [A-Y] pq [^Z] corresponde a qlqr caractere diferente do Z maiusculo,
incluindo letras minúsculas e não letras como o carctere de nova linha.
As classes predefinidas de caracteres localizam um único caractere no objeto de pesquisa.

Quantificadores - Todos os quantificadores afetam apenas a subexpressao imediatamente anterior ao quantificador
* - localiza zero ou mais ocorrencias da subexpressao anterior a *.
+ - tenta identificar uma ou mais ocorrências da subexpressao anterior a +. Se n tiver ao menos 1 ocorrencia
n vai dar match
? - localiza 0 ou 1 ocorrência da expressão que ele quantifica
{n} - localiza n ocorrencias da expressão que ele quantifica
{n,m} - \d{1,4} digito deve ocorrer entre 1 vez e no maximo 4
{0,} - ocorre 0 ou mais vezes
Somente * poderá localizar uma string vazia, já q + tenta identificar uma ou mais ocorrencias

Classes de caracteres pré-definidas
\d - qualquer digito
\w - qualquer letra
\s - espaço em branco
 */
