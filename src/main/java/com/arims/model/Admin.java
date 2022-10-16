package com.arims.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="admin")
public class Admin {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String countryName;
    @Column(nullable = false)

    private String countryCode;
    @Column(nullable = false)
    private String currencyCode;
    @Column(nullable = false)
    private String currencyName;
    private String regionName;
    private String provinceName;
    private String districtName;
    private String subdistrictName;
    private String wardName;

    public Admin () {

    }  public Admin(String countryName, String countryCode, String currencyCode, String currencyName, String regionName,
                    String provinceName,String districtName, String subdistrictName, String wardName ) {
        super();
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.regionName = regionName;
        this.provinceName = provinceName;
        this.districtName= districtName;
        this.subdistrictName = subdistrictName;
        this.wardName= wardName;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getSubdistrictName() {
        return subdistrictName;
    }

    public void setSubdistrictName(String subdistrictName) {
        this.subdistrictName = subdistrictName;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}
