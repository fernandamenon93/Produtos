public interface TaskRepository {
    void save(Task task);
    Task findById(String id);
}
