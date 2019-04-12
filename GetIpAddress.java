
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GetIpAddress {

    public static void main(String[] args) throws UnknownHostException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do site");
        String nomeSite = sc.nextLine();

        try {
            InetAddress add = InetAddress.getByName(nomeSite);
            System.out.println(add);

        } catch (UnknownHostException e) {
            System.out.println("Could not find " + nomeSite);
        }

    }
}
