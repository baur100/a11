package HW11Computer;

public class Motherbord {
    private NameOfBrands nameOfBrands;
    private ProcessorSocket processorSocket;
    private FormFactor formFactor;

    public Motherbord(NameOfBrands nameOfBrands, ProcessorSocket processorSocket, FormFactor formFactor) {
        this.nameOfBrands = nameOfBrands;
        this.processorSocket = processorSocket;
        this.formFactor = formFactor;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public ProcessorSocket getProcessorSocket() {
        return processorSocket;
    }

    public void setProcessorSocket(ProcessorSocket processorSocket) {
        this.processorSocket = processorSocket;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Motherbord{" +
                "nameOfBrands=" + nameOfBrands +
                ", processorSocket=" + processorSocket +
                ", formFactor=" + formFactor +
                '}';
    }
}
