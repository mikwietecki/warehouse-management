package com.mikwietecki.warehousemanagement.data.device;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {
    private Long id;
    private String manufacturer;
    private String model;
    private int ram;
    private int rom;
    private String color;
    private String spec;
    private int quantity;
}
