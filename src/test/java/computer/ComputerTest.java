package computer;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ComputerTest {

    @Test
    public void CreateDocumentTest() {
        // given
        IKeyboard keyboard = Mockito.mock(IKeyboard.class);
        IPrinter printer = Mockito.mock(IPrinter.class);
        Computer computer = new Computer(printer, keyboard);
        when(keyboard.read()).thenReturn("Tekst do druku");
        ArgumentCaptor<Document> documentArgumentCaptor = ArgumentCaptor.forClass(Document.class);

        // when
        computer.createDocument();

        // then
        verify(printer).print(documentArgumentCaptor.capture());
        assertEquals("Tekst do druku", documentArgumentCaptor.getValue().getText());
    }
}
