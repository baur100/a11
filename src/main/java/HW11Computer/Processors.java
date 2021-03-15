package HW11Computer;

public class Processors {
    private NameOfBrands nameOfBrands;
    private NumberOfCores numberOfCores;
    private ProcessorSocket processorSocket;

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public NumberOfCores getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(NumberOfCores numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public ProcessorSocket getProcessorSocket() {
        return processorSocket;
    }

    public void setProcessorSocket(ProcessorSocket processorSocket) {
        this.processorSocket = processorSocket;
    }

    public Processors(NameOfBrands nameOfBrands, NumberOfCores numberOfCores, ProcessorSocket processorSocket) {
        this.nameOfBrands = nameOfBrands;
        this.numberOfCores = numberOfCores;
        this.processorSocket = processorSocket;
    }

    @Override
    public String toString() {
        return "Processors{" +
                "nameOfBrands=" + nameOfBrands +
                ", numberOfCores=" + numberOfCores +
                ", processorSocket=" + processorSocket +
                '}';
    }
}
