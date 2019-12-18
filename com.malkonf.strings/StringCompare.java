
public class StringCompare {

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
                "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4);

        //se o conteúdo dos objetos forem iguais
        if (s1.equals("hello")) {
            System.out.println("s1 equals \"hello\"");
        } else {
            System.out.println("s1 does not equal \"hello\"");
        }

        /*Qd valores de tipo primitivos são comparados com == o resultado é true se ambos valores forem 
        idênticos. Qd as ref são comparadas com ==, o resultado é true se ambas referenciam o msm obj*/
        if (s1 == "hello") {
            System.out.println("s1 is the same object as \"hello\"");
        } else {
            System.out.println("s1 is not the same object as \"hello\"");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.printf("%s equals %s with case ignored\n", s3, s4);
        } else {
            System.out.println("s3 does not equal s4");
        }
        /*retorna 0 se as string forem iguais, negativo se a string for menor que a passada como arg, 
        e positivo se a string for maior que a passada como arg. Ele faz uma comparação lexicográfica*/
        System.out.printf(
                "\ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf(
                "\ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf(
                "\ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf(
                "\ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf(
                "\ns4.compareTo(s3) is %d\n\n", s4.compareTo(s3));

        if (s3.regionMatches(0, s4, 0, 5)) {/*1 arg índice inicial da string q chama o método.
            2 arg é a string a ser comparada. 3 arg é o índice inicial de s4. 4 arg é a qt de caracteres a comparar*/
            System.out.println("First 5 characters of s3 and s4 match");
        } else {
            System.out.println(
                    "First 5 characters of s3 and s4 do not match");
        }

        if (s3.regionMatches(true, 0, s4, 0, 5)) {//primeiro arg é true método ignora maiusculas e minusculas
            System.out.println(
                    "First 5 characters of s3 and s4 match with case ignored");
        } else {
            System.out.println(
                    "First 5 characters of s3 and s4 do not match");
        }
    }
}
