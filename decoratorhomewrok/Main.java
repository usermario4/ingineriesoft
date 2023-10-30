package decoratorhomewrok;

public class Main {
    public static void main(String[] args) {
        Repository<Product> productRepository = new ProductRepository();
        Repository<Product> loggingRepository = new LoggingRepositoryDecorator<>(productRepository);

        Product product = new Product(0, null);
        product.setId(1);
        product.setName("Sample Product");

        loggingRepository.add(product);
        loggingRepository.update(1, product);
        loggingRepository.get(1);
        loggingRepository.delete(1);
    }
}
