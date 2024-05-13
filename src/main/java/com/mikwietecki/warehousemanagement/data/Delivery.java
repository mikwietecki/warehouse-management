package com.mikwietecki.warehousemanagement.data;


import com.mikwietecki.warehousemanagement.data.Company;
import com.mikwietecki.warehousemanagement.data.DeliveryDevice;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private Date deliveryDate;

    @OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<DeliveryDevice> deliveryDevices;
}
