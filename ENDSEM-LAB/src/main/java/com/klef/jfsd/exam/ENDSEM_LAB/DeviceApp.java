package com.klef.jfsd.exam.ENDSEM_LAB;



public class DeviceApp {
    public static void main(String[] args) {
        DeviceController controller = new DeviceController();

     
        controller.addDevice("device", "Samsung", "Galaxy", 1200, null, null, null, null);

        
        controller.addDevice("smartphone", "Apple", "iPhone 14", 999, "iOS", "12 MP", null, null);

       
        controller.addDevice("tablet", "Microsoft", "Surface Pro", 1100, null, null, "12.3 inches", "10 hours");

        System.out.println("Records inserted successfully!");
    }
}

