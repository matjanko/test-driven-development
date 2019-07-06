package library;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookStoreTest {
    IBookStore bookStore;
    IBookRepository bookRepository;
    IPaymentService paymentService;

    @Before
    public void before() {
        paymentService = Mockito.mock(IPaymentService.class);
        bookRepository = Mockito.mock(IBookRepository.class);
        bookStore = new BookStore(bookRepository, paymentService);
    }

    @Test
    public void borrowBookTest() {
        // when
        when(bookRepository.findByTitle("Lord of the rings")).thenReturn(new Book(100));
        Book book = bookStore.borrowBook("Lord of the rings");

        // then
        assertNotNull(book);
    }

    @Test
    public void borrowBookGetPaidTest() {
        // when
        when(bookRepository.findByTitle(anyString())).thenReturn(new Book(100));
        Book book = bookStore.borrowBook("Lord of the rings");

        // then
        assertNotNull(book);
        verify(paymentService).pay(100);
    }
}
