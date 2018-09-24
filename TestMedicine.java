
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medicine med1;
		med1= new Medicine();
		med1.displayMedicine();
		
		Medicine med2;
		med2= new Medicine("Cipla",20);
		med2.displayMedicine();
		
		med2.setMedicineName("GSK");
		med2.setMedicinePrice(30);
		med2.displayMedicine();

	}

}
