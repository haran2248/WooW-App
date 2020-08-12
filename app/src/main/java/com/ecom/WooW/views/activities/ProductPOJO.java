package com.ecom.WooW.views.activities;

public class ProductPOJO {
    String ProductName;
    String ImgUrl;
    String ProPrice;
    String Availability;
    String Expiry;


    public ProductPOJO(String productName, String imgUrl, String proPrice, String availability, String expiry) {
        ProductName = productName;
        ImgUrl = imgUrl;
        ProPrice = proPrice;
        Availability = availability;
        Expiry = expiry;
    }


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
    public String getExpiry() {
        return Expiry;
    }

    public void setExpiry(String expiry) {
        Expiry = expiry;
    }


    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getProPrice() {
        return ProPrice;
    }

    public void setProPrice(String proPrice) {
        ProPrice = proPrice;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }
}
