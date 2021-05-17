/**
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE ------- Version ----------- Author -------- DESCRIPTION<br>
 * 2021-05-13 - 1.0 --------------- NangNN -------- First Version<br>
 */
package entity;

/**
 *
 * This class represents the Information table in database
 *
 * @author nangnnhe130538
 */
public class Information {

    /**
     * Information address
     */
    private String address;
    /**
     * Information city
     */
    private String city;
    /**
     * Information country
     */
    private String country;
    /**
     * Information tel
     */
    private String tel;
    /**
     * Information email
     */
    private String email;
    /**
     * Information image
     */
    private String image;

    /**
     * Constructor.<br>
     */
    public Information() {
    }

    /**
     * Constructor.<br>
     *
     * @param address. It is a <code>java.lang.String</code>
     * @param city. It is a <code>java.lang.String</code>
     * @param country. It is a <code>java.lang.String</code>
     * @param tel. It is a <code>java.lang.String</code>
     * @param email. It is a <code>java.lang.String</code>
     * @param image . It is a <code>java.lang.String</code>
     */
    public Information(String address, String city, String country, String tel, String email, String image) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.tel = tel;
        this.email = email;
        this.image = image;
    }

    /**
     * Get address. <br>
     *
     * @return address. It is a <code>java.lang.String</code>
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get city. <br>
     *
     * @return city. It is a <code>java.lang.String</code>
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get country. <br>
     *
     * @return country. It is a <code>java.lang.String</code>
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get tel. <br>
     *
     * @return tel. It is a <code>java.lang.String</code>
     */
    public String getTel() {
        return tel;
    }

    /**
     * Set tel
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Get email. <br>
     *
     * @return email. It is a <code>java.lang.String</code>
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get image. <br>
     *
     * @return image. It is a <code>java.lang.String</code>
     */
    public String getImage() {
        return image;
    }

    /**
     * Set image
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }
}
