abstract class Shape {
	abstract int area();
}

class Rectangle extends Shape {
	
	int length, breadth, area;
	
	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int area() {
		area = length * breadth;
		return area;
	}
}

class Triangle extends Shape {
	
	int length, breadth;
	double area;
	
	Triangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int area() {
		area = 0.5 * length * breadth;
		return (int)area;
	}
}

class Circle extends Shape {
	
	int radius;
	double area;
	
	Circle(int r) {
		radius = r;
	}
	
	public int area() {
		area = 3.14 * radius * radius;
		return (int)area;
	}
}

class ShapeDemo {
	public static void main(String args[]) {
		
		Rectangle rectangle = new Rectangle(20, 10);
		System.out.println("Area of Rectangle: "+rectangle.area());
		
		Triangle triangle = new Triangle(20, 10);
		System.out.println("Area of Triangle: "+triangle.area());
		
		Circle circle = new Circle(20);
		System.out.println("Area of Circle: "+circle.area());
	}
}