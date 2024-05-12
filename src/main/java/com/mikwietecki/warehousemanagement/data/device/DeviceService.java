package com.mikwietecki.warehousemanagement.data.device;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    private final static int ZERO = 0;
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<DeviceDto> findAllDevices() {
        return deviceRepository.findAllByQuantityGreaterThan(ZERO).stream()
                .map(DeviceDtoMapper::map)
                .toList();
    }

    public List<DeviceDto> findBySearchTerm(String searchTerm) {
        return deviceRepository.findByManufacturerContainingIgnoreCaseOrModelContainingIgnoreCase(searchTerm,searchTerm).stream()
                .map(DeviceDtoMapper::map)
                .toList();
    }
}
