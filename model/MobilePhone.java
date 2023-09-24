package com.myapp.model;

/**
 * Represents a mobile phone with brand, model, and memory size attributes.
 */
public class MobilePhone {

    // Phone brand
    private String brand;
    
    // Phone model
    private String model;
    
    // Memory size (in GB)
    private int memorySize;

    /**
     * Constructs a MobilePhone with specified brand, model, and memory size.
    */
    public MobilePhone(String brand, String model, int memorySize) {
        if(brand == null || brand.trim().isEmpty() || model == null || model.trim().isEmpty() || memorySize <= 0) {
            throw new IllegalArgumentException("Invalid arguments provided");
        }
        this.brand = brand;
        this.model = model;
        this.memorySize = memorySize;
    }

    /**
     * Returns a string representation of the mobile phone.
     *
     * @return a string representation of the phone
     */
    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
