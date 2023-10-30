package decoratorhomewrok;
public class ProductRepository implements Repository<Product> {
    @Override
    public void add(Product item) {
        System.out.println("Adding product: " + item);
    }

    @Override
    public Product get(int id) {
        System.out.println("Getting product with ID: " + id);
        return null; 
    }

    @Override
    public void update(int id, Product item) {
        System.out.println("Updating product with ID " + id + ": " + item);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting product with ID: " + id);
    }
}
