package tugas.junit;

public class Converter {
	
	private double hasil;
	InputCheck hasilCek = new InputCheck();
	
	public double cmToInch(int centimeter) {
		if (hasilCek.inputCheck(centimeter) == "true") {
			hasil = centimeter / 2.54;
			return hasil;
		}
		else {
			return 0;
		}
	}
	
	public double cmToFoot(int centimeter) {
		if (hasilCek.inputCheck(centimeter) == "true") {
			hasil = centimeter / 30.48;
			return hasil;
		}
		else {
			return 0;
		}
	}
	
	public double cmToMeter(int centimeter) {
		if (hasilCek.inputCheck(centimeter) == "true") {
			hasil = centimeter / 100;
			return hasil;
		}
		else {
			return 0;
		}
	}
}
