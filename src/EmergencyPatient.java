
public class EmergencyPatient implements MedicalProcedureAPI {
	private String code = "Emergency 100";
	private String description = "Emergency Patient"; 
	private double cost = 11.25;
	
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

}
