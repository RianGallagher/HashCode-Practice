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
  String[] products;
  Drone[] drones;
  Order[] orders;
  Warehouse[] warehouses;
  int D,O,W; //number of Drones,Orders,Warehouses

  public Grid(int rows,int cols,int payload,int turns,String[] products, Drone[] drones, Order[] orders,Warehouse[] warehouses){
    this.rows = rows;
    this.cols = cols;
    this.payload = payload;
    this.turns = turns;
    this.products = products;
    this.drones = drones;
    this.orders = orders;
    this.warehouses = warehouses;
    grid = new int[rows][cols];
    D = drones.length;
    O = orders.length;
    W = warehouses.length;

    //Populate grid with drones
    for(int i = 0; i < drones.length; i++)
	grid[drones[i].r][drones[i].c] = 2;

	//Populate grid with warehouses
	for(int i = 0; i < warehouses.length; i++){
		Warehouse temp = warehouses[i];
		//if position already has a drone
		if(grid[temp.r][temp.c] > 1){
			grid[temp.r][temp.c] += 2;
		}
		else
			grid[temp.r][temp.c] = 1;
	}

	//Populate grid with customers
	for(int i = 0; i < orders.length; i++){
		Order temp = orders[i];
		if(grid[temp.r][temp.c] > 2)
			grid[temp.r][temp.c] += 2;
		else
			grid[temp.r][temp.c] = 3;
	}
  }
	/*
	 * 0 is empty
	 * 1 is warehouse
	 * 2 is drone
	 * 3 is a customer
	 * 4 is drone and warehouse
	 * 5 is drone and customer
	 *
	 */
    public void printGrid(){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; i < grid[0].length; i++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
    }


  //TODO: brainstorm useful methods



}

public class Solution {
  public static void main( String[] args ) {
    int[] prod = {0,1,2};
    Warehouse w = new Warehouse(0,1,2,prod);
    System.out.println(w.toString());

  }

}
