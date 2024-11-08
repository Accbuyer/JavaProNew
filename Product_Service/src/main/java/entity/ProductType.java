package entity;

import lombok.Getter;

@Getter
public enum ProductType {
    CARD("card"),
    ACCOUNT("account");

    ProductType(String name) {
        this.name = name;
    }
    private final String name;
}
