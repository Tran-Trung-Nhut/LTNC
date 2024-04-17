package com.transportation.app.webapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Truck extends Vehicle {
    private int maxLoadCapacity;
    private boolean isRefrigerated;
}
