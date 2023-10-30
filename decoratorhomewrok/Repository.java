package decoratorhomewrok;

public interface Repository<T> {
    void add(T item);
    T get(int id);
    void update(int id, T item);
    void delete(int id);
}
