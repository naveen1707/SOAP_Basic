package org.io.naveen;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class DummyFinder {

	public static void main(String[] args) {
		
		if(args.length!=1)
		{
			System.out.println("you need to pass one IP Address");
		}

		else
		{
			String IPAddress=args[0];
			GeoIPService ipservice=new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap=ipservice.getGeoIPServiceSoap();
			GeoIP geoIP=geoIPServiceSoap.getGeoIP(IPAddress);
			System.out.println(geoIP.getCountryName());
		}
	}

}
