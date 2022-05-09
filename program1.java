class product{
	String pcode;
	String pname;
	double price;
	
	String lowestPrice(product p1,product p2,product p3)
	{
		if(p1.price<p2.price&&p1.price<p3.price){
		return p1.pname;
		}
		else if(p2.price<p1.price && p2.price<p3.price){
		return p2.pname;
		}
		else{
		return p3.pname;
		}
	}
	void SetValues(String pcode,String pname,double price){
	this.pcode=pcode;
	this.pname=pname;
	this.price=price;
	}
}
class program1{
	public static void main(String []args){
	product p1=new product();
	product p2=new product();
	product p3=new product();
	p1.SetValues("p11","realme",18000);
	p2.SetValues("p12","iphone",50000);
	p3.SetValues("p13","samsung",28000);
	String lowest;
	lowest=p3.lowestPrice(p2,p3,p1);
	System.out.println(lowest+" has lowest price");
}
}
