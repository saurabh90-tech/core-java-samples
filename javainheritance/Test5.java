package javainheritance;
//Hierarchical Inheritance
class Product{
	String product_name;
	double product_cost;
	int product_qty;
	
	public Product(String product_name, double product_cost, int product_qty) {
		super();
		this.product_name = product_name;
		this.product_cost = product_cost;
		this.product_qty = product_qty;
	}
	
	void getProductDetails() {
		System.out.println(this.product_name + " " + this.product_cost + " " + this.product_qty);
	}	
}
class Laptop extends Product{
	public Laptop(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		// TODO Auto-generated constructor stub
	}	
}
class Desktop extends Product{
	public Desktop(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		// TODO Auto-generated constructor stub 
	}	
}
class Tab extends Product{
	public Tab(String product_name, double product_cost, int product_qty) {
		super(product_name, product_cost, product_qty);
		// TODO Auto-generated constructor stub
	}	
}
public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop("Dell Inspiron", 75000, 10);
		laptop.getProductDetails();
		
		Desktop desktop = new Desktop("IBM Server",90000, 15);
		desktop.getProductDetails();
		
		Tab tab = new Tab("Samsung A6", 20000, 20);
		tab.getProductDetails();
	}
}
