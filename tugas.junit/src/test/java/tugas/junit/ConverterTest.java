package tugas.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ConverterTest {

	public Converter converter;
	public InputCheck cek;
	public int masukan;
	
	@BeforeEach
	public void setUp(){
		converter = new Converter();
		cek = new InputCheck();
	}

	@Test
	@DisplayName("Konversi centimeter ke inci berhasil")
	void testCmToInchSuccess() {
		assertEquals("true", cek.inputCheck(masukan));
		assertEquals((masukan / 2.54), converter.cmToInch(masukan));
	}
	
	@Test
	@DisplayName("Konversi centimeter ke foot berhasil")
	void testCmToFootSuccess() {
		assertEquals("true", cek.inputCheck(masukan));
		assertEquals((masukan / 30.48), converter.cmToInch(masukan));
	}
	
	@Test
	@DisplayName("Konversi centimeter ke meter berhasil")
	void testCmToMeterSuccess() {
		assertEquals("true", cek.inputCheck(masukan));
		assertEquals((masukan / 100), converter.cmToInch(masukan));
	}
	
	@Test
	@DisplayName("Masukan tidak valid")
	void testMasukanTidakValid() {
		InputCheck cek = mock(InputCheck.class);
		when(cek.inputCheck(masukan)).thenReturn("false");
		
		assertEquals("false", cek.inputCheck(masukan));
	}
	
	@Test
	@DisplayName("Masukan valid")
	void testMasukanValid() {
		InputCheck cek = mock(InputCheck.class);
		when(cek.inputCheck(masukan)).thenReturn("true");
		
		assertEquals("true", cek.inputCheck(masukan));
	}

	@Test
	@DisplayName("Konversi centimeter ke inci gagal")
	void testCmToInchFail() {
		assertEquals("false", cek.inputCheck(masukan=-1));
		assertEquals(0, converter.cmToInch(masukan));
	}
	
	@Test
	@DisplayName("Konversi centimeter ke foot gagal")
	void testCmToFootFail() {
		assertEquals("false", cek.inputCheck(masukan=-1));
		assertEquals(0, converter.cmToFoot(masukan));
	}
	
	@Test
	@DisplayName("Konversi centimeter ke meter gagal")
	void testCmToMeterFail() {
		assertEquals("false", cek.inputCheck(masukan=-1));
		assertEquals(0, converter.cmToMeter(masukan));
	}
	
	
}
