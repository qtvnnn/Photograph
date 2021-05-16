/**
 * Copyright (C) 2021, FPT University J3.L.P0017 Photographer
 *
 * Record of change: DATE Version Author DESCRIPTION 2021-05-13 1.0 NangNN First
 * Version
 */
package entity;

/**
 *
 * This class represents the Share table in database
 *
 * @author nangnnhe130538
 */
public class Share {

    /**
     * Share icon
     */
    private String icon;
    /**
     * Share socialNetwork
     */
    private String socialNetwork;
    /**
     * Share url
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
     * @param icon. It is a <code>java.lang.String</code>
     * @param socialNetwork. It is a <code>java.lang.String</code>
     * @param url. It is a <code>java.lang.String</code>
     */
    public Share(String icon, String socialNetwork, String url) {
        this.icon = icon;
        this.socialNetwork = socialNetwork;
        this.url = url;
    }

    /**
     * Get icon. <br>
     *
     * @return icon. It is a <code>java.lang.String</code>
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Set icon
     *
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Get socialNetwork. <br>
     *
     * @return socialNetwork. It is a <code>java.lang.String</code>
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Set socialNetwork
     *
     * @param socialNetwork
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    /**
     * Get url. <br>
     *
     * @return url. It is a <code>java.lang.String</code>
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
