package com.example.week02_lab_lethanhtung_20008831.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProductPrice {
    @Id
    @Column(name = "price_date_time", nullable = false, length = 10)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime id;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "node", nullable = true, length = 100)
    private String node;

    @ManyToOne
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "product_id")
    private Product product;

}
