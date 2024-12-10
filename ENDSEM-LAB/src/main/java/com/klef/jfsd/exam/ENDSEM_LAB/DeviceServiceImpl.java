package com.klef.jfsd.exam.ENDSEM_LAB;



public class DeviceServiceImpl implements DeviceService {
    private DeviceDAO deviceDAO;

    public DeviceServiceImpl() {
        deviceDAO = new DeviceDAOImpl();
    }

    @Override
    public void saveDevice(Device device) {
        deviceDAO.addDevice(device);
    }
}
