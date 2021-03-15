package lesson10;

public class NeuroSurgeon extends Doctor{
    private boolean surgery;

    public NeuroSurgeon(boolean surgery) {
        this.surgery = surgery;
    }

    public NeuroSurgeon(String hospital_name, int salary, int patients, boolean surgery) {
        super(hospital_name, salary, patients);
        this.surgery = surgery;
    }

    public boolean isSurgery() {
        return surgery;
    }

    public void setSurgery(boolean surgery) {
        this.surgery = surgery;
    }

    @Override
    public String toString() {
        return "NeuroSurgeon{" +
                "surgery=" + surgery +
                '}';
    }
}