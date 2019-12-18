
public class Strings {

    public static void main(String[] args) {

        String info = "";

        info += "Meu nome é Rodrigo";
        info += " ";
        info += "I'm developer";
        //Strings são imutáveis, n podem ser alteradas
        //então no code acima qnd alteramos a string, toda vez q uma é grudada na outra é criado uma nova a partir da outra
        //como é sempre gerada a partir de outra, num programa grande pode tornar ineficiente
        System.out.println(info);
        //quando usamos o StringBuilder n é criado uma nova String e sim modifica o conteúdo da existente
        StringBuilder sb = new StringBuilder();
        sb.append("\tMy name is Rodrigo");
        sb.append(" ");
        sb.append("I'm a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        //métodos encadeados
        s.append("My name is Roger").append(" ").append("I'm skydriver");

        System.out.println(s.toString());

    }
//StringBuffer é usado p multithreading
}
