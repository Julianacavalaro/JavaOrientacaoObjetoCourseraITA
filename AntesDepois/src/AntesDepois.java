
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntesDepois {
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@beforeEach");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@afterEach");
	}
	
	@BeforeAll
	// p o método funcionar ele deve ser estático
	public static void beforeclass() {
		System.out.println("@beforeAll");
	}
	
	@AfterAll
	// p o método funcionar ele deve ser estático
	public static void afterclass() {
		System.out.println("@afterAll");
	}
	
	@Test
	public void test1() {
		System.out.println("teste1");
	}
	
	@Test
	public void test2() {
		System.out.println("teste2");
	}
	
	@Test
	public void test3() {
		System.out.println("teste3");
	}

}
