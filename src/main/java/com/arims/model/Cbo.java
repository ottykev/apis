package com.arims.model;

import org.hibernate.annotations.Type;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name="cbo")
public class Cbo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String countryCode;
    @Column(nullable = false)
    private String provinceCode;
    @Column(nullable = false)
    private String cboName;
    private int population;


    private String areaHectares;
    @Column(nullable = false)
    private String ownershipType;
    @Column(nullable = false)
    private boolean registered;
    @Column(nullable=false)
    private int registrationNumber;
    @Lob
    @Column(length = Integer.MAX_VALUE, nullable = true)
    private byte[] constitution;
    @Column(nullable = false)
    private String chairpersonContact;
    @Column(nullable = false)
    private String secretaryContact;
    @Column(nullable = false)
    private String treasurerContact;
    @Column(nullable = false)
    private int numberWomen;
    @Column(nullable = false)
    private int numberYouth;
    @Column(nullable = false)
    private int pwd;

    public Cbo() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCboName() {
        return cboName;
    }

    public void setCboName(String cboName) {
        this.cboName = cboName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }



    public String getAreaHectares() {
        return areaHectares;
    }

    public void setAreaHectares(String areaHectares) {
        this.areaHectares = areaHectares;
    }

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public byte[] getConstitution() {
        return constitution;
    }

    public void setConstitution(byte[] constitution) {
        this.constitution = constitution;
    }

    public String getChairpersonContact() {
        return chairpersonContact;
    }

    public void setChairpersonContact(String chairpersonContact) {
        this.chairpersonContact = chairpersonContact;
    }

    public String getSecretaryContact() {
        return secretaryContact;
    }

    public void setSecretaryContact(String secretaryContact) {
        this.secretaryContact = secretaryContact;
    }

    public String getTreasurerContact() {
        return treasurerContact;
    }

    public void setTreasurerContact(String treasurerContact) {
        this.treasurerContact = treasurerContact;
    }

    public int getNumberWomen() {
        return numberWomen;
    }

    public void setNumberWomen(int numberWomen) {
        this.numberWomen = numberWomen;
    }

    public int getNumberYouth() {
        return numberYouth;
    }

    public void setNumberYouth(int numberYouth) {
        this.numberYouth = numberYouth;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", code=" + countryCode + ", provinceCode=" + provinceCode
                + ", name=" + cboName +", population="+ population +  ", area="+ areaHectares+ ",ownership="+ ownershipType+
                ",registered =" +registered + ",registration_number="+ registrationNumber + ", constitution="
                + Arrays.toString(constitution) + ", chaiperson " + chairpersonContact +
                ", secretary" + secretaryContact + ", treasurer " + treasurerContact +
                ", women" + numberWomen + ",youth" + numberYouth +", pwd=" + pwd + "]";
    }
}
