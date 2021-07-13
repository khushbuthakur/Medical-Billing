public class MiscellaneousAdapter implements MedicalProcedureAPI {

	private ItemAPI item;

	public MiscellaneousAdapter(ItemAPI item) {
		super();
		this.item = item;
	}

	@Override
	public String getCode() {
		return this.item.getName() + " " + this.item.getId();
	}

	@Override
	public String getDesc() {
		return this.item.getName() + " " + this.item.getDescription();
	}

	@Override
	public double getCost() {
		return this.item.getPrice();
	}

	@Override
	public String toString() {
		return "MiscellaneousAdapter [item=" + item + "]";
	}
}
