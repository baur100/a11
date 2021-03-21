package hw11;

import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private Keybord keybord;
    private Monitor[] monitors;
    private SystemBlock systemBlock;

    public Computer(Mouse mouse, Keybord keybord, Monitor[] monitors, SystemBlock systemBlock) {
        this.mouse = mouse;
        this.keybord = keybord;
        this.monitors = monitors;
        this.systemBlock = systemBlock;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keybord getKeybord() {
        return keybord;
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
                ", keybord=" + keybord +
                ", monitors=" + Arrays.toString(monitors) +
                ", systemBlock=" + systemBlock +
                '}';
    }
}
