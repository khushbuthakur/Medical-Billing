import java.util.ArrayList;
import java.util.List;

public class MedicalBill {

	private List<MedicalProcedureAPI> medicalItems;

	public MedicalBill() {
		super();
		this.medicalItems = new ArrayList<>();
	}

	public void addItems(MedicalProcedureAPI item) {
		this.medicalItems.add(item);
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nTotal bill with items is : \n");
		double total = 0;
		int count = 1;
		
		for(MedicalProcedureAPI p : medicalItems) {
			   System.out.println(p.getCode());
				str.append(count++)
				.append(") ")
				.append(p.getCode())
				.append(", price : ")
				.append(p.getCost())
				.append("\n");
			
			total += p.getCost();
		}
		
		str.append("\n--------------------------------\nTotal Bill is : ");
		str.append(total);
		return str.toString();
	}

}
