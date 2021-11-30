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
	
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
}
