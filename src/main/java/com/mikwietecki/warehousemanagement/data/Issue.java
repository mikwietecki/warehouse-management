package com.mikwietecki.warehousemanagement.data;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    private Date issueDate;

    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL)
    private List<IssueDevice> issueDevices;
}
