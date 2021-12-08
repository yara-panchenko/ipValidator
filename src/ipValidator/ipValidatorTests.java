package ipValidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ipValidatorTests {

	@Test
	void ShouldReturnFalse_GivenEmptyStringParameter() {
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address(""));
	}
	
	@Test
	void ShouldBe_False_GivenStringWithOutThreeDots() {
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address(".."));
		assertFalse(validator.ValidateIpv4Address("...."));
	}
	
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		IpValidator validator = new IpValidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
	
	@Test
	void ShouldBe_False_GivenStringWithThreeNumbersAndDots() {
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("1.2.3."));
	}
	
	@Test
	void ShouldBe_False_GivenStringWithFourNumbersNotInRange0_255(){
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("1.2.3.257"));
		assertFalse(validator.ValidateIpv4Address("1.2.300.4"));
		assertFalse(validator.ValidateIpv4Address("1.256.3.4"));
		assertFalse(validator.ValidateIpv4Address("312.2.3.4"));
	}
	
	@Test
	void ShouldBe_False_GivenIPstartingWithZero() {
		ipvalidator validator= new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("0.2.3.4"));
	}
	
	@Test
	void ShouldBe_False_GivenIPendingWithZero() {
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("1.2.3.0"));
	}
	
	@Test
	void ShouldBe_False_GivenIPstartingWith255() {
		ipvalidator validator= new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("255.2.3.4"));
	}
	
	@Test
	void ShouldBe_False_GivenIPendingWith255() {
		ipvalidator validator = new ipvalidator();
		assertFalse(validator.ValidateIpv4Address("1.2.3.255"));
	}
}
