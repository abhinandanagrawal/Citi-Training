
public class Medicine {
private String medicineName;
private int medicinePrice;
public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public int getMedicinePrice() {
	return medicinePrice;
}
public void setMedicinePrice(int medicinePrice) {
	this.medicinePrice = medicinePrice;
}

public void displayMedicine()
{
	System.out.println("Medicine:"+medicineName+"\tPrice"+medicinePrice);
}
public Medicine() {
	medicineName="medicine1";
	medicinePrice=10;
}
public Medicine(String name,int price)
{

	medicineName=name;
	medicinePrice=price;
}

}
