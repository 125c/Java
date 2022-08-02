package interfaceClass;

public class invoice extends Object implements Payable {//宣告一個類別invoice要實作Payable

	private String partNumber;
	private String partDescription;
	private double pricePerItem;
	private int quantity;
	
	public invoice(String partNumber,String partDescription,double pricePerItem,int quantity) 
	{
		super();
//		if(partNumber.equals("")||partDescription.equals("")) {
//			throw new IllegalArgumentException("要寫貨號跟商品描述");
//		}
//		if(pricePerItem<0.0) {
//			throw new IllegalArgumentException("商品單價要>0");
//		}
//		if(quantity<0) {
//			throw new IllegalArgumentException("商品數量>0");
//		}
//		this.partNumber=partNumber;
//		this.partDescription=partDescription;
//		this.pricePerItem=pricePerItem;
//		this.quantity=quantity;
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setPricePerItem(pricePerItem);
		setQuantity(quantity);
		//上面4行相當於if到this
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		if(partNumber.equals("")) {
			throw new IllegalArgumentException("要寫貨號");
		}
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		if(partDescription.equals("")) {
			throw new IllegalArgumentException("要寫商品描述");
		}
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public double getPricePerItem() {
		if(pricePerItem<0.0) {
			throw new IllegalArgumentException("商品單價要>0");
		}
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			throw new IllegalArgumentException("商品數量>0");
		}
		this.quantity = quantity;
	}
	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		return (getPricePerItem()*getQuantity());
	}
	@Override
	public String toString() 
	{
		return String.format("%s: %s%n%s: %s%n%s: %.2f元%n%s:%2d個%n%s: %.2f元%n",
				"貨物編號",getPartNumber(),
				"貨物描述",getPartDescription(),
				"貨物單價",getPricePerItem(),
				"貨物數量",getQuantity(),
				"總金額",getPaymentAmount());
	}
}
