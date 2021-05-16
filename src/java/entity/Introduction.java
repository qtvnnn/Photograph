/**
 * Copyright (C) 2021, FPT University J3.L.P0017 Photographer
 *
 * Record of change: DATE Version Author DESCRIPTION 2021-05-13 1.0 NangNN First
 * Version
 */
package entity;

/**
 *
 * This class represents the Introduction table in database
 *
 * @author nangnnhe130538
 */
public class Introduction {

    /**
     * Introduction address
     */
    private String image;
    /**
     * Introduction descript
     */
    private String descript;
    /**
     * Introduction aboutme
     */
    private String aboutme;

    /**
     * Constructor.<br>
     */
    public Introduction() {
    }

    /**
     * Constructor.<br>
     *
     * @param image. It is a <code>java.lang.String</code>
     * @param descript. It is a <code>java.lang.String</code>
     * @param aboutme. It is a <code>java.lang.String</code>
     */
    public Introduction(String image, String descript, String aboutme) {
        this.image = image;
        this.descript = descript;
        this.aboutme = aboutme;
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

    /**
     * Get descript. <br>
     *
     * @return descript. It is a <code>java.lang.String</code>
     */
    public String getDescript() {
        return descript;
    }

    /**
     * Set descript
     *
     * @param descript
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * Get aboutme. <br>
     *
     * @return aboutme. It is a <code>java.lang.String</code>
     */
    public String getAboutme() {
        return aboutme;
    }

    /**
     * Set aboutme
     *
     * @param aboutme
     */
    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

}
