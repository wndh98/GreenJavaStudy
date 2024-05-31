package inet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public static void main(String[] args) {
		InetAddress local = null;

		try {
			local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			System.out.println(local.isReachable(1));
			System.out.println(Arrays.toString(local.getAddress()));
			System.out.println("----------------------");
			InetAddress[] naverIps = InetAddress.getAllByName("naver.com");
			for (InetAddress ip : naverIps) {
				System.out.println(ip.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

//  

