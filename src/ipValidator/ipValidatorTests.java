package ipValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ipValidatorTests {

	@Test
	void ShouldReturnFalse_GivenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIpv4Address(""));
	}
	
	@Test
	void ShouldBe_False_GivenStringWithOutThreeDots() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIpv4Address(".."));
		assertFalse(validator.ValidateIpv4Address("...."));
	}
}
