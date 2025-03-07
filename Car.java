class Car{
String brand;
int year;
void display()
{
System.out.println(brand);
System.out.println(year);
}
public static void main(String[] args){
  Car c1=new Car();
  Car c2=new Car();
  c1.brand="BMW";
  c1.year=1990;
  c2.brand="toyota";
  c2.year=2002;
  
  c1.display();
  c2.display();
 }
}
