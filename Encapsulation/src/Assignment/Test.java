package Assignment;

public class Test {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setId(321);
		patient.setName("Ebruski");
		patient.setSsn("0987654321");

		System.out.println("Id: " + patient.getId());
		System.out.println("Name: " + patient.getName());
		System.out.println("SSN: " + patient.getSsn());
	}

}
