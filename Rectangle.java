class Rectangle{
 double length;
 double breadth;
 double area(){
    return breadth*length;
    }
 public static void main(String[] args){
 
 Rectangle rect1= new Rectangle();
 Rectangle rect2= new Rectangle();
  rect1.length=10;
  rect1.breadth=20;
  rect2.length=30;
  rect2.breadth=40;
  System.out.println("Area of rect1:"+rect1.area());
  System.out.println("Area of rect2:"+rect2.area());
  }
  }
