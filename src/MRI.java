
public class MRI extends MedicalProcedureDecoratorAPI {

	private String code = "MRI 101";
	private String description = "Magnetic resonance imaging (MRI) scans produce detailed images of the organs and tissues in the body, "; 
	private double cost = 35.99;
	
	public MRI(MedicalProcedureAPI medicalProcedureAPI) {
		super(medicalProcedureAPI);
	}

	@Override
	public String getCode() {
		return super.getCode() + "\nCode : " + this.code;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc() + "\nDescription: " + this.description;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + this.cost;
	}

	@Override
	public String toString() {
		return "\n---------------- \nMRI [code=" + this.getCode() + ",\ndescription=" + this.getDesc() + ",\n cost=" + this.getCost() + "]";
	}
	
}
