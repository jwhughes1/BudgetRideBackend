package com.budgetride.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "DRIVER")
public class DriverJPA extends AccountJPA {

    // @PrimaryKeyJoinColumn(name = "DRIVERID")
    @PrimaryKeyJoinColumn(name = "ACCOUNTID")

    //@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    @OneToMany
    @JoinColumn(name = "DRIVERID", nullable = true)
    private List<VehicleJPA> vehicleJPAs;

    @Column(name = "STATUS", nullable = true)
    private String status;

    @Column(name = "VEHICLETYPEINSERVICE", nullable = true)
    private String vehicleTypeInService;

}
