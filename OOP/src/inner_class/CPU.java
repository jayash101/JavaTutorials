package inner_class;

class CPU {
    double price;

    // nested class
    protected class Processor {
        // members of nested class
        double cores;
        String manufacturer;

        double get_cache() {
            return 4.3;
        }
    }

    protected class RAM {
        // members of nested class
        double memory;
        String manufacturer;

        double get_clock_speed() {
            return 5.5;
        }
    }
}
