package com.timur.cakmak.test.car;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    public Car(String string, String registration2, String brand2, String color2, String fuel2, double power2,
            int maxSpeed2, int km2, boolean inUse2, String string2) {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String registration;
    private String brand;
    private String color;
    private String fuel;
    private double power;
    private int maxSpeed;
    private int km;
    private boolean inUse;
    @Temporal(TemporalType.DATE)
    private Date firstUse;
}
