
public class StringConstructors {

    public static void main(String[] args) {

        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);/*6 representa a posição inicial q os caracteres em charArray 
        serão acessados. 3 é o número de caracteres a ser acessados no array*/

        System.out.printf(
                "s = %s \ns1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s, s1, s2, s3, s4);
    }
}
