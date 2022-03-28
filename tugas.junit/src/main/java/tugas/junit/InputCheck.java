package tugas.junit;

public class InputCheck {
	public String inputCheck(int masukan){
		if (masukan < 0){
			return "false";
		}
		else {
			return "true";
		}
	}
}
