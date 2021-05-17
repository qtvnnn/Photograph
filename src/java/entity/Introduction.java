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
     * Introduction description
     */
    private String description;
    /**
     * Introduction aboutMe
     */
    private String aboutMe;

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
        this.description = descript;
        this.aboutMe = aboutme;
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
     * Get description. <br>
     *
     * @return description. It is a <code>java.lang.String</code>
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get aboutMe. <br>
     *
     * @return aboutMe. It is a <code>java.lang.String</code>
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * Set aboutMe
     *
     * @param aboutMe
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

}
