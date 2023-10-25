import BockService.BookService;
import BockService.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class BockServiceTests {
    InMemoryBookRepository repository = mock(InMemoryBookRepository.class);
    BookService service = new BookService(repository);

}
