
public class RegularPatient implements MedicalProcedureAPI {
	private String code = "Regular 101";
	private String description = "Regular Patient"; 
	private double cost = 4.5;
	
	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getDesc() {
		return description;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "RegularPatient [code=" + code + ", description=" + description + ", cost=" + cost + "]";
	}
}
