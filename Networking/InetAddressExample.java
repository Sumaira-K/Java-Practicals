import java.net.*;
public class InetAddressExample
 {
    public static void main(String[] args) 
    {
        try {
            InetAddress address = InetAddress.getByName("google.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException e) 
        {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}      