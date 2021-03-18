package hwEnum;

public class Sports {
    private String name;
    private Equipment equip;

    public Sports(String name, Equipment equip) {
        this.name = name;
        this.equip = equip;
    }

    public String getName() {
        return name;
    }

    public Equipment getEquip() {
        return equip;
    }
}
