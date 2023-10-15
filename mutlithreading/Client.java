public class Client {
    public static void main(String[] args) {
        State state = new State();
        state.setCurrentPrinterType(PrinterType.ODD);

        Printer oddPrinter = new Printer(1, PrinterType.ODD, PrinterType.EVEN, 2, 50, state);
        Printer evenPrinter = new Printer(2, PrinterType.EVEN, PrinterType.ODD, 2, 50, state);

        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);

        oddThread.start();
        evenThread.start();
    }
}
