
public class StringBuilderCapLen {

    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");//inicializa com tamanho da string passada mais 16

        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n",
                buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);//expande a capacidade p no mínimo 75
        System.out.printf("New capacity = %d\n\n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\n",
                buffer.length(), buffer.toString());
    }
}
/*Aumentar a capacidade do StringBuilder dinamicamente pode exigir um tempo longo. Se for aumentar, aumente no início do programa.*/
/*Em ensureCapacity se a capacidade for menor que o arg, o método assegura uma capacidade q é o maior número especificado como um argumento e duas vezes a capacidade original mais 2. Se o arg for menor que a capacidade atual ela permanece inalterada.

Em setLength se o comprimento especificado é menor q o numero atual de caracteres, o conteúdo é truncado, se for maior são add caractes nulos( zero) no comprimento adicional*/
