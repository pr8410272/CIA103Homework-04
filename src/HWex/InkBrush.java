package HWex;

public class InkBrush extends Pen{
	private String brand;
	private double price;
	
		public void write(){
			System.out.println("沾墨汁再寫");
		}
		@Override
		public void SetPrice(double price){
			this.price=price*0.9;
		}
		@Override
		public double getPrice(){
			return price;
		}
}
