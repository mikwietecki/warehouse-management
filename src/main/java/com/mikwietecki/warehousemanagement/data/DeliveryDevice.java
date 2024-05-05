package com.mikwietecki.warehousemanagement.data;


import com.mikwietecki.warehousemanagement.data.device.Device;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "delivery_device")
public class DeliveryDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device devicel;

    private int quantity;
}
