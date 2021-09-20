// perimeter area of circle

class Circle{
	double x,y;
	double r;
	double area(){
		return 3.14 * r*r;
	}
	double circumference(){
		return 2 * 3.14 *r;
	}
}

class rectangle{
	double x,y;
	double perimeter(){
		return 2*(x+y);
	}
	double area(){
		return x*y;
	}
}

class demo{
	public static void main(String Args[]){
		Circle c=new Circle();
		rectangle rec = new rectangle();
		c.x=2.0;
		c.y=3.0;
		c.r=5.0;
		rec.x=4.0;
		rec.y=5.0;
		System.out.println("Area of Circle" + c.area());
		System.out.println("Circumference of Circle" + c.circumference());
		System.out.println("Area of rectangle" + rec.area());
		System.out.println("Perimeter of rectangle" + rec.perimeter());
		
	}
	
}
