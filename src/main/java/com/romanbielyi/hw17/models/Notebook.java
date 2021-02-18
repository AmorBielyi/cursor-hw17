package com.romanbielyi.hw17.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String model;
    private String manufacturer;
    private String cpu;
    private String caseColor;
    private int ram;
    private int price;
    private boolean refurbished;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    public Notebook() {

    }

    public Notebook(String model,
                    String manufacturer,
                    String cpu,
                    String caseColor,
                    int ram,
                    int price,
                    boolean refurbished,
                    Date releaseDate) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.caseColor = caseColor;
        this.ram = ram;
        this.price = price;
        this.refurbished = refurbished;
        this.releaseDate = releaseDate;
    }

}
