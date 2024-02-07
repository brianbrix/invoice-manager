package com.invoice.invoicemanager.models;

public class AdvertSizeAndPrice {
    private Long advertSizeAndPriceId;
    private Long advertSize;
    private Double advertPrice;

    public Long getAdvertSizeAndPriceId() {
        return advertSizeAndPriceId;
    }

    public void setAdvertSizeAndPriceId(Long advertSizeAndPriceId) {
        this.advertSizeAndPriceId = advertSizeAndPriceId;
    }

    public Long getAdvertSize() {
        return advertSize;
    }

    public void setAdvertSize(Long advertSize) {
        this.advertSize = advertSize;
    }

    public Double getAdvertPrice() {
        return advertPrice;
    }

    public void setAdvertPrice(Double advertPrice) {
        this.advertPrice = advertPrice;
    }
}
