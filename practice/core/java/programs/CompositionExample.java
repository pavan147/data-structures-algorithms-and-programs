package practice.core.java.programs;

class CPU {
    String model;

    CPU(String model) {
        this.model = model;
    }

    void displayInfo() {
        System.out.println("CPU Model: " + model);
    }
}

class RAM {
    String size;

    RAM(String size) {
        this.size = size;
    }

    void displayInfo() {
        System.out.println("RAM Size: " + size);
    }
}

class HardDrive {
    String capacity;

    HardDrive(String capacity) {
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Hard Drive Capacity: " + capacity);
    }
}

class Computer {
    CPU cpu;
    RAM ram;
    HardDrive hardDrive;

    Computer(String cpuModel, String ramSize, String hardDriveCapacity) {
        this.cpu = new CPU(cpuModel);
        this.ram = new RAM(ramSize);
        this.hardDrive = new HardDrive(hardDriveCapacity);
    }

    void displayInfo() {
        cpu.displayInfo();
        ram.displayInfo();
        hardDrive.displayInfo();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel i7", "16GB", "1TB");
        computer.displayInfo();
    }
}
