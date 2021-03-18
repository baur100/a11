package hw11;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor[] monitors;
    private SystemBlock systemBlock;

    public Computer(Mouse mouse, Keyboard keyboard, Monitor[] monitors, SystemBlock systemBlock) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitors = monitors;
        this.systemBlock = systemBlock;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }
}
