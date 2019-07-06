package library;

public class BookStore implements IBookStore {
    IBookRepository bookRepository;
    IPaymentService paymentService;

    public BookStore(IBookRepository bookRepository, IPaymentService paymentService) {
        this.bookRepository = bookRepository;
        this.paymentService = paymentService;
    }

    public Book borrowBook(String title) {
        Book book = bookRepository.findByTitle(title);
        paymentService.pay(book.getPrice());
        return book;
    }
}
