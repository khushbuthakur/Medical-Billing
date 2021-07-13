public class Tylenol extends ItemAPI {
	public String description = "Analgesic\n" + "It can treat minor aches and pains, and reduces fever";
	public String name = "Acetaminophen";
	public double price = 2.49;
	public int id = 444;

	public Tylenol(String description, String name, double price, int id) {
		this.description = description;
		this.name = name;
		this.price = price;
		this.id = id;
	}

	public Tylenol() {

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\n-------------\nTylenol [description=" + description + ", name=" + name + ", price=" + price + ", id="
				+ id + "]";
	}
}
