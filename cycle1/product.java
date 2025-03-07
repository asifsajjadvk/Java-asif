public class product{
      String pcode;
      String pname;
      int price;
      
      public product(String pcode_get,String pname_get,int price_get){
              pcode=pcode_get;
              pname=pname_get;
              price=price_get;
      
      }
      
      public static void main(String args[]){
              product p1=new product("A101","TV",15000);
              product p2=new product("A102","MOBILE",20000);
              product p3=new product("A103","COMPUTER",30000);
              
              
              if(p1.price <= p2.price && p1.price <= p3.price){
                    System.out.println("Lowest product is :"+p1.price);
              }
              if(p2.price <= p1.price && p2.price <= p3.price){
                   System.out.println("Lowest product is :"+p2.price); 
              }
              if(p3.price <= p1.price && p3.price <= p2.price){
                   System.out.println("Lowest product is :"+p2.price); 
              }
              
      
      
      }
      
      

}
