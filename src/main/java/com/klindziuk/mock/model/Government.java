package com.klindziuk.mock.model;

import com.klindziuk.mock.service.SEComission;

/**
 * Created by Hp on 10/12/2017.
 */
public class Government {
    private String country;
    private SEComission comission;

    public int getSecLawQuantity() {
        return comission.getLaws().size();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SEComission getComission() {
        return comission;
    }

    public void setComission(SEComission comission) {
        this.comission = comission;
    }

    @Override
    public String toString() {
        return "Government{" +
                "country='" + country + '\'' +
                ", comission=" + comission +
                '}';
    }
}
