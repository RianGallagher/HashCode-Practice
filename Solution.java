import java.util.*
class Warehouse{
  int id,r,c;
  String[] products;

  public Warehouse(int id,int r,int c,String[] products){
    this.id = id;
    this.r = r;
    this.c = c;
    this.products = products;
  }

  //TODO: brainstorm useful methods

  public String toString(){
    String s = "Id: " + id + "\n(r,c) = " + r + "," + c + "\nProducts: ";
    for(String i:products) s += i + " ";
    return s;
  }

}

class Drone{
  int id,r,c,payload;
  String[] products;
  boolean busy;

  public Drone(int id,int r,int c){
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

  public Order(int id,int r,int c,String[] products){
    this.id = id;
    this.r = r;
    this.c = c;
    this.products = products;
  }

  //TODO: brainstorm useful methods

  public String toString(){
    String s = "Id: " + id + "\n(r,c) = " + r + "," + c + "\nProducts: ";
    for(String i:products) s += i + " ";
    return s;
  }

}

class Grid{
  int grid[][];
  int rows,cols;
  int payload,turns;
  int productQty;
  String[] productWeights;
  Drone[] drones;
  Order[] orders;
  Warehouse[] warehouses;
  int D,O,W; //number of Drones,Orders,Warehouses

  public Grid(int rows,int cols,int payload,int turns,int productQty,String[] productWeights, Drone[] drones, Order[] orders,Warehouse[] warehouses){
    this.rows = rows;
    this.cols = cols;
    this.payload = payload;
    this.turns = turns;
    this.products = products;
    this.productWeights = productWeights;
    this.drones = drones;
    this.orders = orders;
    this.warehouses = warehouses;
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
  	Scanner sc =new Scanner(System.in);
  	int rows = sc.nextInt();
  	int cols = sc.nextInt();
  	int nDrones = sc.nextInt();

  	int turns = = sc.nextInt();
  	int payload = sc.nextInt();
  	sc.nextLine();
  	int nProd = sc.nextInt();
  	sc.nextLine();
  	String[] productsWeights = sc.nextLine().split(" ");
  	int nWarehouse = in.nextInt();
  	Warehouse[] warehouses = new Warehouse[nWarehouse];
  	for(int i = 0;i < nWarehouse;i++){
  		int x = sc.nextInt();
  		int y = sc.nextInt();
  		sc.nextLine|();
  		String[] prod = sc.nextLine().split(" ");
  		W[i] = new Warehouse(i,x,y,prod);
  	}
  	int nOrders = sc.nextInt();
  	Order[] orders = new Order[nOrders];
	for(int i =0; i < nOrders;i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		String[] prod = new String[n];
		for(int j = 0; j < n;j++){
			int x = sc.nextInt();
			prod[x] = "1";
			}
			orders[i] = new Order(i,x,y,prod);
	}
	Drone[] drones = new Drone[nDrones];
	for(int i = 0;i < nDrones;i++){
		drones[i] = new Drone(i,warehouses[0].r,warehouses[0].c);
	}
	Grid grid = new Grid(rows,cols,payload,turns,nProd,productsWeights,drones,orders,warehouses);
  }

}