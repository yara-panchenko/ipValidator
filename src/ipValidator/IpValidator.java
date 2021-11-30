package ipValidator;

import java.util.function.BooleanSupplier;

public class IpValidator {

	public Boolean ValidateIpv4Address(String ipString) {
		if(ipString == "") {
			return false;
		}
		return true;
	}

}
