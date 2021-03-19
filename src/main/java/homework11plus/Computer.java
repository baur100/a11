package homework11plus;

import java.util.Arrays;

public class Computer {
    private ComputerCase computerCase;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor[] monitors;

    public Computer(ComputerCase computerCase, Keyboard keyboard, Mouse mouse, Monitor[] monitors){
        this.computerCase = computerCase;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitors = monitors;
    }

    public Computer(){}

    public ComputerCase getSystemBlock(){
        return computerCase;
    }

    public void setSystemBlock(){
        this.computerCase = computerCase;
    }

    public Keyboard getKeyboard(Keyboard keyboard){
        return keyboard;
    }

    public void setKeyboard(){
        this.keyboard = keyboard;
    }

    public Mouse getMouse(){
        return mouse;
    }

    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public Monitor[] getMonitors(){
        return monitors;
    }

    public void setMonitors(Monitor[] monitors){
        this.monitors = monitors;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "systemBlock: " + computerCase +
                ", keyboard: " + keyboard +
                ", mouse: " + mouse +
                ", monitors: " + Arrays.toString(monitors) +
                '}';
    }
}
