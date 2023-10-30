package decoratorhomewrok;

public class LoggingRepositoryDecorator<T> implements Repository<T> {
    private Repository<T> decoratedRepository;

    public LoggingRepositoryDecorator(Repository<T> decoratedRepository) {
        this.decoratedRepository = decoratedRepository;
    }

    @Override
    public void add(T item) {
        System.out.println("Logging: Adding operation");
        decoratedRepository.add(item);
    }

    @Override
    public T get(int id) {
        System.out.println("Logging: Getting operation");
        return decoratedRepository.get(id);
    }

    @Override
    public void update(int id, T item) {
        System.out.println("Logging: Updating operation");
        decoratedRepository.update(id, item);
    }

    @Override
    public void delete(int id) {
        System.out.println("Logging: Deleting operation");
        decoratedRepository.delete(id);
    }
}
