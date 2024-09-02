package HWex;


public class Pencil extends Pen{
	private String brand;
	private double price;
	
	public void write(){
		System.out.println("削鉛筆再寫");
}
	@Override
	public void SetPrice(double price){
		this.price=price*0.8;
	}
	@Override
	public double getPrice(){
		return price;
	}
}
