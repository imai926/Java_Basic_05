package java_basic_05_02;
import java.util.ArrayList;

public class index_02 {
	    public static void main(String[] args) {
	        ShoppingCart shopcart = new ShoppingCart();
	        shopcart.addItem(new Product("商品A", 50.0));
	        shopcart.addItem(new Product("商品B", 30.0));
	        shopcart.addItem(new Product("商品C", 20.0));

	        System.out.println("ショッピングカートの合計金額: $" + shopcart.getTotalPrice());
	    }
	}

	class Product{
	    private String name;
	    private double price;

	    public Product(String name , double price){
	        this.name = name;
	        this.price = price;
	    }

	    public double getPrice(){
	        return price;
	    }
	}

	class ShoppingCart{
	    private ArrayList<Product> items = new ArrayList<>();
	    private int itemCount = 0;
	    private int MAX_itemCount = 6;

	    public void addItem(Product product){
	        if (MAX_itemCount > items.size()){
	            items.add (product);
	            itemCount++;
	        }else {
	            System.out.println("カートがいっぱいです。商品を追加できません。");
	        }
	    }

	    public double getTotalPrice(){
	        double total = 0.0;
	        for(int i = 0; i < itemCount; i++){
	            total += (items.get(i)).getPrice();
	        }
	        return total;
	    }
	}
