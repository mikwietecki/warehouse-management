package com.mikwietecki.warehousemanagement.data.device;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;
    private String model;
    private int ram;
    private int rom;
    private String color;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(255)")
    private Spec spec;

    private int quantity;
}

enum Spec {
    EU, NON_EU
}
