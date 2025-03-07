class Animal{
String species;
boolean carnivora;
double height;

void display()
{
System.out.println("Specie name:"+species);
System.out.println("Is Carnivorous:"+carnivora);
System.out.println("height:"+height);
}
public static void main(String[] args){
Animal a1=new Animal();
Animal a2=new Animal();
Animal a3=new Animal();

a1.species="Panthera";
a1.carnivora=true;
a1.height=120.5;

a2.species="Angler";
a2.carnivora=true;
a2.height=3000.3;

a3.species="Rabbitfish";
a3.carnivora=false;
a3.height=250.30;

a1.display();
a2.display();
a3.display();
}
}
