public abstract class MedicalProcedureDecoratorAPI implements MedicalProcedureAPI {

	protected MedicalProcedureAPI medicalProcedureAPI;

	public MedicalProcedureDecoratorAPI(MedicalProcedureAPI medicalProcedureAPI) {
		this.medicalProcedureAPI = medicalProcedureAPI;
	}

	@Override
	public String getCode() {
		return this.medicalProcedureAPI.getCode();
	}

	@Override
	public String getDesc() {
		return this.medicalProcedureAPI.getDesc();
	}

	@Override
	public double getCost() {
		return this.medicalProcedureAPI.getCost();
	}
}
