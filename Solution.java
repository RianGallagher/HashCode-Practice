
class Warehouse{
  int id,r,c;
  int[] products;
  
  public Warehouse(int id,int r,int c,int[] products){
    this.id = id;
    this.r = r;
    this.c = c;
    this.products = products;
  }
  
  //TODO: brainstorm useful methods
  
  public String toString(){
    String s = "Id: " + id + "\n(r,c) = " + r + "," + c + "\nProducts: ";
    for(int i:products) s += i + " ";
    return s;
  }
  
}

class Drone{
  int id,r,c,payload;
  int[] products;
  boolean busy;
  
  public Drone(int id,int r,int c,int payload,int[] products){
    this.id = id;
    this.r = r;
    this.c = c;
    this.payload = payload;
    this.products = products;
    busy = false;
  }
  
  //TODO: brainstorm useful methods
  
  public String toString(){
    String s = "Id: " + id + ", Payload: " + payload + "u\n(r,c) = " + r + "," + c + "\nProducts: ";
    for(int i:products) s += i + " ";
    return s;
  }
}

class Order{
  int id,r,c; //r,c are the location of the customer
  int[] products;
  
  public Order(int id,int r,int c,int[] products){
    this.id = id;
    this.r = r;
    this.c = c;
    this.products = products;
  }
  
  //TODO: brainstorm useful methods
  
  public String toString(){
    String s = "Id: " + id + "\n(r,c) = " + r + "," + c + "\nProducts: ";
    for(int i:products) s += i + " ";
    return s;
  }
  
}

class Grid{
  int grid[][];
  int rows,cols;
  int payload,turns;
  int[] products;
  Drone[] drones;
  Order[] orders;
  Warehouse[] warehouses;
  int D,O,W; //number of Drones,Orders,Warehouses
  
  public Grid(int rows,int cols,int payload,int turns,int[] products, Drone[] drones, Order[] orders,Warehouse[] warehouses){
    this.rows = rows;
    this.cols = cols;
    this.payload = payload;
    this.turns = turns;
    this.products = products;
    this.drones = drones;
    this.orders = orders;
    this.warehouses = warehouses;
    D = drones.length;
    O = orders.length;
    W = warehouses.length;
  }
  
  //TODO: brainstorm useful methods
  
  public String toString(){
    return null;
  }
  
}

public class Solution {
  
  public static void main( String[] args ) {
    int[] prod = {0,1,2};
    Warehouse w = new Warehouse(0,1,2,prod);
    System.out.println(w.toString());
  }
  
}
