import java.util.ArrayList;

public class Cart {
	
	ArrayList<CartItem> items = new ArrayList<>();
	ArrayList<IPromotion> promotions = new ArrayList<>();
	double promotionSumOfProducts = 0;
	
	
	public void totalPriceOfItems(){
		double sum=0;
		for(CartItem it : items)
		{
			sum += it.getProduct().getPrice();
			
		}
		
	}

}
