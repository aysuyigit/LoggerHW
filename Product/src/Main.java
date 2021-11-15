
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new FileProductLogger(),new DbProductLogger()};
		ProductManager productManager = new ProductManager();
		Product first = new Product(1,"aa");
		productManager.logs(loggers);
	}

}
