package com.invoice.invoicemanager.models;

public class Advert {
    private Long advertId;



    private Client client;
    private String advertRef;

    public AdvertSizeAndPrice getAdvertSizeAndPrice() {
        return advertSizeAndPrice;
    }

    public void setAdvertSizeAndPrice(AdvertSizeAndPrice advertSizeAndPrice) {
        this.advertSizeAndPrice = advertSizeAndPrice;
    }

    private AdvertSizeAndPrice advertSizeAndPrice;

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }

    public String getAdvertRef() {
        return advertRef;
    }

    public void setAdvertRef(String advertRef) {
        this.advertRef = advertRef;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



}
