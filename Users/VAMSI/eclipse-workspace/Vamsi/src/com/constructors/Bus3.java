 
package com.constructors;
class Bus3 {

    Bus3() {
        this("Volvo");
        System.out.println("Constructor 1");
    }

    Bus3(String name) {
        this(name, 101);
        System.out.println("Constructor 2");
    }

    Bus3(String name, int id) {
        this(name, id, "AC");
        System.out.println("Constructor 3");
    }

    Bus3(String name, int id, String model) {
        System.out.println("Constructor 4");
    }

    public static void main(String[] args) {
        Bus3 b = new Bus3();
    }
}