//set points

class set{
	double x,y;
	void setpoint(double a,double b){
		x=a;
		y=b;
	}
}
class demo1{
	public static void main(String Args[]){
		set s=new set();
		s.setpoint(23,45);
		System.out.println(" x =" + s.x);
		System.out.println(" y =" + s.y);
	}
}
