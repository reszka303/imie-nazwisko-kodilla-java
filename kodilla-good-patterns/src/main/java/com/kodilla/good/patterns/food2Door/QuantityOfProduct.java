package com.kodilla.good.patterns.food2Door;

public class QuantityOfProduct {
    private Integer quantityOfProduct;

    public QuantityOfProduct(Integer quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    @Override
    public String toString() {
        return "" + quantityOfProduct + " pieces, ";

    }
}
