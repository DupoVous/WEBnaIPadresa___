import java.net.*;
import java.net.InetAddress;

public class WEBnaIPadresa {
    public static void main (String[] args) {
        try {
            //------------------------------------------------
            System.out.println("--------------------------");
            System.out.println(">>> MOJE IP");
            // Returns the instance of InetAddress containing
            // local host name and address
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("System IP Address : " +
                    (localhost.getHostAddress()).trim());

            // Find public IP address
            String systemipaddress = "";

            //---------------------------------------------
            System.out.println("--------------------------");
            System.out.println(">>> ROZSAH IP ZE WWW");
            InetAddress[] addresses = InetAddress.getAllByName("www.seznam.cz");

            for (int i = 0; i < addresses.length; i++) {
                System.out.println(addresses[i]);
            }
            //--------------------------------------------------------
            System.out.println("--------------------------");
            System.out.println(">>> IP ZE WWW");
            InetAddress addressA = InetAddress.getByName("www.seznam.cz");
            InetAddress addressB = InetAddress.getByName("www.google.com");
            InetAddress addressC = InetAddress.getByName("www.java67.com");

            System.out.println(addressA);
            System.out.println(addressB);
            System.out.println(addressC);
        } catch (UnknownHostException ex) {
            System.out.println("Nemohu najít - www.xxx.com");
        }
    }
}