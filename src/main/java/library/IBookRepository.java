package library;

public interface IBookRepository {
    Book findByTitle(String title);
}
