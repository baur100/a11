package hw11AF18;

import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor[] monitors;
    private SystemBlock systemBlock;

    public Computer(){};
    public Computer(Mouse mouse, Keyboard keyboard, Monitor[] monitors, SystemBlock systemBlock) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitors = monitors;
        this.systemBlock = systemBlock;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    @Override
    public String toString() {
        return "Computer " +
                "\nMouse= " + mouse +
                "\nKeyboard= " + keyboard +
                "\nMonitors="  + Arrays.toString(monitors) +
                "\nSystem block= " + systemBlock;
    }
}
