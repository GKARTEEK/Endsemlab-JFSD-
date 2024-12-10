package com.klef.jfsd.exam.ENDSEM_LAB;



public class DeviceController {
    private DeviceService deviceService;

    public DeviceController() {
        deviceService = new DeviceServiceImpl();
    }

    public void addDevice(String type, String brand, String model, double price, String os, String camera, String screen, String battery) {
        if ("smartphone".equalsIgnoreCase(type)) {
            Smartphone smartphone = new Smartphone();
            smartphone.setBrand(brand);
            smartphone.setModel(model);
            smartphone.setPrice(price);
            smartphone.setOperatingSystem(os);
            smartphone.setCameraResolution(camera);
            deviceService.saveDevice(smartphone);
        } else if ("tablet".equalsIgnoreCase(type)) {
            Tablet tablet = new Tablet();
            tablet.setBrand(brand);
            tablet.setModel(model);
            tablet.setPrice(price);
            tablet.setScreenSize(screen);
            tablet.setBatteryLife(battery);
            deviceService.saveDevice(tablet);
        } else {
            Device device = new Device();
            device.setBrand(brand);
            device.setModel(model);
            device.setPrice(price);
            deviceService.saveDevice(device);
        }
    }
}
