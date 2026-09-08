package com.likelion.seminar.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Provider extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 공급업체 이름
    private String name;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private List<Product> products = new ArrayList<>();

    public Provider(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
        product.setProvider(this);
    }

}
