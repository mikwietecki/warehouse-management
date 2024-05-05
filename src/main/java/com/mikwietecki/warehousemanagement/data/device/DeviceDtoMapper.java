package com.mikwietecki.warehousemanagement.data.device;

public class DeviceDtoMapper {
    static DeviceDto map(Device device) {
        return new DeviceDto(
                device.getId(),
                device.getManufacturer(),
                device.getModel(),
                device.getRam(),
                device.getRom(),
                device.getColor(),
                device.getSpec().name(),
                device.getQuantity()
        );
    }
}
