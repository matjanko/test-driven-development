package computer;

public class Computer {
    private IPrinter printer;
    private IKeyboard keyboard;

    public Computer(IPrinter printer, IKeyboard keyboard) {
        this.printer = printer;
        this.keyboard = keyboard;
    }

    public void createDocument() {
        String text = keyboard.read();
        Document document = new Document(text);
        printer.print(document);
    }
}
