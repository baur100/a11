package hw11_UA;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Computer{" +
                "mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", monitors=" + Arrays.toString(monitors) +
                ", systemBlock=" + systemBlock +
                '}';
    }
}
