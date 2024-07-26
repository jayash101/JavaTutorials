package inner_class;

class CPU{
    double price;

    // nested class
   protected class Processor{
        // members of nested class
        double cores;
        String manufacturer;

        double get_cache(){
            return 4.3;
        }
    }

    protected class RAM{
        // members of nested class
        double memory;
        String manufacturer;

        double get_clock_speed(){
            return 5.5;
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        // object of outer class
        CPU cpu = new CPU();
        cpu.price = 34500.25;

        // object of inner class Processor
        CPU.Processor processor = cpu.new Processor();
        processor.cores = 1000;
        processor.manufacturer = "Dell";
        double processor_cache = processor.get_cache();

        // object of inner class RAM
        CPU.RAM ram = cpu.new RAM();
        ram.memory = 1024;
        ram.manufacturer = "Dell";
        double ram_clock_speed = ram.get_clock_speed();

        // accessing all the objects
        System.out.println("Manufacturer name: " + processor.manufacturer);
        System.out.println("CPU Price: " + cpu.price);
        System.out.println("Processor Cores: " + processor.cores);
        System.out.println("Processor Cache: " + processor_cache);
        System.out.println("RAM space: " + ram.memory);
        System.out.println("RAM Clock Speed: " + ram_clock_speed);
    }
}
