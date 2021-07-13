public class ToothPaste extends ItemAPI {
	public String description = "Crest is an American brand of toothpaste and other oral hygiene products made by American multinational Procter & Gamble and sold worldwide.";
	public String name = "Crest";
	public double price = 11.45;
	public int id = 666;

	public ToothPaste(String description, String name, double price, int id) {
		this.description = description;
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public ToothPaste() {
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String toString() {
		return "\n-------------\nToothPaste [description=" + description + ", name=" + name + ", price=" + price + ", id=" + id + "]";
	}
}
