package creational.builder.java;

public class Computer {
    private String cpu;
    private String ram;
    private String mainBoard;
    private String gpu;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.mainBoard = builder.mainBoard;
        this.gpu = builder.gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String mainBoard;
        private String gpu;

        public Builder addCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder addGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder addRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder addMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Computer builde() {
            return new Computer(this);
        }
    }
}
