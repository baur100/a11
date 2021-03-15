package HW11Computer;

public class Keyboard {
    private NameOfBrands nameOfBrands;
    private String language;

    public Keyboard(NameOfBrands nameOfBrands, String language) {
        this.nameOfBrands = nameOfBrands;
        this.language = language;
    }

    public NameOfBrands getNameOfBrands() {
        return nameOfBrands;
    }

    public void setNameOfBrands(NameOfBrands nameOfBrands) {
        this.nameOfBrands = nameOfBrands;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "nameOfBrands=" + nameOfBrands +
                ", language='" + language + '\'' +
                '}';
    }
}
