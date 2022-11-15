package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	int product_id;
	String product_name;
	float price;
	
	public Product(int product_id, String product_name, float price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}	
	
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101,"Laptop",56000f));
		list.add(new Product(102,"Desktop",26000f));
		list.add(new Product(103,"Tab",32000f));
		list.add(new Product(104,"Android",16000f));
		list.add(new Product(105,"Iphone",166000f));
		
		List<Float> resultList = list.stream().filter( p -> p.price > 30000).map(p -> p.price).collect(Collectors.toList());
		System.out.println(resultList);
		
		Double addAmount =  list.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(addAmount);
		
	}

}
