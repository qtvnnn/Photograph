/*
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        NangNN           First Version<br>
 */
package entity;

/**
 * This class used to contain attributes and methods getter, setter of <code>Share</code> object
 * This class represents the <code>Share</code> table in database
 *
 * @author nangnnhe130538
 */
public class Share {

    /**
     * <code>Share</code> icon
     */
    private String icon;
    /**
     * <code>Share</code> socialNetwork
     */
    private String socialNetwork;
    /**
     * <code>Share</code> url
     */
    private String url;

    /**
     * Constructor.<br>
     */
    public Share() {
    }

    /**
     * Constructor.<br>
     *
     * @param icon it is a <code>java.lang.String</code>
     * @param socialNetwork it is a <code>java.lang.String</code>
     * @param url it is a <code>java.lang.String</code>
     */
    public Share(String icon, String socialNetwork, String url) {
        this.icon = icon;
        this.socialNetwork = socialNetwork;
        this.url = url;
    }

    /**
     * Get value from icon attribute of <code>Share</code> class. <br>
     *
     * @return icon it is a <code>java.lang.String</code>
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Set value to icon attribute of <code>Share</code> class
     *
     * @param icon it is a <code>java.lang.String</code>
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Get value from socialNetwork attribute of <code>Share</code> class. <br>
     *
     * @return socialNetwork it is a <code>java.lang.String</code>
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Set value to socialNetwork attribute of <code>Share</code> class
     *
     * @param socialNetwork it is a <code>java.lang.String</code>
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    /**
     * Get value from url attribute of <code>Share</code> class. <br>
     *
     * @return url it is a <code>java.lang.String</code>
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set value to url attribute of <code>Share</code> class
     *
     * @param url it is a <code>java.lang.String</code>
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
