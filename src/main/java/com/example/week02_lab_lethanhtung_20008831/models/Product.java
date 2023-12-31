package com.example.week02_lab_lethanhtung_20008831.models;

import com.example.week02_lab_lethanhtung_20008831.enums.ProductStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NamedQueries({
    @NamedQuery(name = "Product.getProductsActive", query = "SELECT p FROM Product p WHERE p.status = :status"),
    @NamedQuery(name = "Product.deleteProduct", query = "UPDATE Product p SET p.status = 'IN_ACTIVE' WHERE p.id = :id")
})
public class Product {
    @Id
    @Column(name = "product_id", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("product_id")
    private long id;

    @Column(name = "product_name" ,nullable = false, length = 100)
    @JsonProperty("product_name")
    private String productName;

    @Column(nullable = false, length = 255)
    @JsonProperty("description")
    private String description;

    @Column(nullable = false, length = 50)
    @JsonProperty("unit")
    private String unit;

    @Column(name = "manufacturer_name" ,nullable = false, length = 100)
    @JsonProperty("manufacturer_name")
    private String manufacturerName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "enum('ACTIVE', 'IN_ACTIVE', 'TERMINATE')" ,nullable = false, length = 10)
    @JsonProperty("status")
    private ProductStatus status;

    @OneToMany(mappedBy = "product")
    @PrimaryKeyJoinColumn(name = "product_id")
    private List<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product")
    @PrimaryKeyJoinColumn(name = "product_id")
    private List<ProductImage> productImages;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;

    public Product(){}

    public Product(String productName, String description, String unit, String manufacturerName, ProductStatus status) {
        this.productName = productName;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

}
