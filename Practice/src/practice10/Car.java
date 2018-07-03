package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;


	public int run() {

		int limitNumber = 15;
		int random = 1;

		random = new java.util.Random().nextInt(limitNumber) + 1;
		gasoline--;

		if(gasoline>=0) {
			return random;
		}else {
			return -1;

		}


	}
}