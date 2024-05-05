package com.mikwietecki.warehousemanagement.data.device;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, Long> {
    List<Device> findAllByQuantityGreaterThan(int quantity);
}
