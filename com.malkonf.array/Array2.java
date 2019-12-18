
public class Array2 {

    public static void main(String[] args) {
        String[] names = getNames();

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) { //trata exceção(somente para aprendizado)
                System.out.println(names[i]);
                System.out.println(names[i].charAt(0));
            }
        }
    }

    public static String[] getNames() {
        String[] names = new String[6];

        names[0] = "Rafa";
        names[1] = "Demont";
        names[2] = "Ruullos";
        names[3] = "Yhj";
        names[4] = "U23";

        return names;
    }

}
