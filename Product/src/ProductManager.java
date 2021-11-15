public class ProductManager implements ProductService {

	private ProductDao productDao;

	public ProductManager() {
		super();
	}

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void save(Product product) {

	}

	@Override
	public void log(Logger logger) {
		logger.log();
		
	}
	
	public void logs(Logger[] loggers) {
		for (Logger logger : loggers) {
			log(logger);
		}
	}
	
	

}
