package oops;

class Product{
	int product_id;
	String product_name;
	int product_qty;
	
	//Default constructor : It gets invoked automatically
	Product(){
		System.out.println("Default Constructor gets executed !!!");
		product_id = 111;
		product_name = "Laptop";
		product_qty = 8;
	}
	
	void getProductDetails(){
		System.out.println(product_id + " " + product_name + " " + product_qty);
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Product().getProductDetails();
		
//		Product p1 = new Product();
//		p1.getProductDetails();
//		p1.product_id = 222;
//		System.out.println(p1.product_id);
		
	}

}
