package HW11Computer;


import java.util.Arrays;

public class Computer {
        private Mouse mouse;
        private Keyboard keyboard;
        private Monitor[] monitors;
        private SystemBlock systemBlock;
        private VedeoCard vedeoCard;
        private Processors processors;
        private Memory memory;
        private HardDrive hardDrive;
        private Motherbord motherbord;
        private PowerSupplie powerSupplie;

        public Computer(){};

        public Computer(Mouse mouse, Keyboard keyboard, Monitor[] monitors, SystemBlock systemBlock, VedeoCard vedeoCard, Processors processors, Memory memory, HardDrive hardDrive, Motherbord motherbord, PowerSupplie powerSupplie) {
                this.mouse = mouse;
                this.keyboard = keyboard;
                this.monitors = monitors;
                this.systemBlock = systemBlock;
                this.vedeoCard = vedeoCard;
                this.processors = processors;
                this.memory = memory;
                this.hardDrive = hardDrive;
                this.motherbord = motherbord;
                this.powerSupplie = powerSupplie;
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

        public VedeoCard getVedeoCard() {
                return vedeoCard;
        }

        public void setVedeoCard(VedeoCard vedeoCard) {
                this.vedeoCard = vedeoCard;
        }

        public Processors getProcessors() {
                return processors;
        }

        public void setProcessors(Processors processors) {
                this.processors = processors;
        }

        public Memory getMemory() {
                return memory;
        }

        public void setMemory(Memory myMemory) {
                this.memory = memory;
        }

        public HardDrive getHardDrive() {
                return hardDrive;
        }

        public void setHardDrive(HardDrive hardDrive) {
                this.hardDrive = hardDrive;
        }

        public Motherbord getMotherbord() {
                return motherbord;
        }

        public void setMotherbord(Motherbord motherbord) {
                this.motherbord = motherbord;
        }

        public PowerSupplie getPowerSupplie() {
                return powerSupplie;
        }

        public void setPowerSupplie(PowerSupplie powerSupplie) {
                this.powerSupplie = powerSupplie;
        }

        @Override
        public String toString() {
                return "Computer{" +
                        "mouse=" + mouse +
                        ", keyboard=" + keyboard +
                        ", monitors=" + Arrays.toString(monitors) +
                        ", systemBlock=" + systemBlock +
                        ", vedeoCard=" + vedeoCard +
                        ", processors=" + processors +
                        ", memory=" + memory +
                        ", hardDrive=" + hardDrive +
                        ", motherbord=" + motherbord +
                        ", powerSupplie=" + powerSupplie +
                        '}';
        }
}