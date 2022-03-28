package tugas.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputCheckTest {

	private InputCheck cek;
	
	@BeforeEach
	public void setUp(){
		cek = new InputCheck();
	}

	@Test
	@DisplayName("Input Lebih dari Sama Dengan Nol")
	public void testInputLebihDariSamaDenganNol() {
		assertEquals("true", cek.inputCheck(0));
	}
	
	@Test
	@DisplayName("Input Kurang dari Nol")
	public void testInputKurangDariNol() {
		assertEquals("false", cek.inputCheck(-1));
	}

}
