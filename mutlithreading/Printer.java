import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
@AllArgsConstructor
public class Printer implements Runnable{

    private int currentValue;
    private PrinterType currentPrintType;
    private PrinterType nextPrintType;
    private int step;
    private int maxValue;
    private State state;

    @SneakyThrows
    @Override
    public void run() {
        while(currentValue <= maxValue){
            synchronized (state){
                while (state.getCurrentPrinterType() != this.currentPrintType){
                    state.wait();
                }
                System.out.println(this.currentPrintType + "===" + this.currentValue);
                state.setCurrentPrinterType(this.nextPrintType);
                this.currentValue+=step;
                state.notifyAll();
            }
        }
    }
}
