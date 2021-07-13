
public class XRAY extends MedicalProcedureDecoratorAPI {

	private String code = "XRAY 101";
	private String description = "X-rays are a type of radiation called electromagnetic waves. X-ray imaging creates pictures of the inside of your body."; 
	private double cost = 12.99;
	
	public XRAY(MedicalProcedureAPI medicalProcedureAPI) {
		super(medicalProcedureAPI);
	}

	@Override
	public String getCode() {
		return super.getCode() + "\nCode : " + this.code;
	}

	@Override
	public String getDesc() {
		return super.getDesc() + "\nDescription: " + this.description;
	}

	@Override
	public double getCost() {
		return super.getCost() + this.cost;
	}

	@Override
	public String toString() {
		return "\n ------------------- \nXRAY [code=" + this.getCode() + ",\ndescription=" + this.getDesc() + ",\n cost=" + this.getCost() + "]";
	}
	
}
