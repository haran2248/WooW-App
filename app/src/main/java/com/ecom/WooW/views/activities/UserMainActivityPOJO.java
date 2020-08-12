package com.ecom.WooW.views.activities;

public class UserMainActivityPOJO {

    String ImgLogoUrl;
    String businessName;
    String businessDesc;

    public UserMainActivityPOJO(String imgLogoUrl, String businessName, String businessDesc) {
        ImgLogoUrl = imgLogoUrl;
        this.businessName = businessName;
        this.businessDesc = businessDesc;
    }

    public String getImgLogoUrl() {
        return ImgLogoUrl;
    }

    public void setImgLogoUrl(String imgLogoUrl) {
        ImgLogoUrl = imgLogoUrl;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }
}
