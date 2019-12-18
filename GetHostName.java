
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class GetHostName {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress iAddress = InetAddress.getLocalHost();
        String hostName = iAddress.getHostName();
        String canonicalHostName = iAddress.getCanonicalHostName();

        System.out.println("HostName:" + hostName);
        System.out.println("Canonical Host Name:" + canonicalHostName);
    }
}
