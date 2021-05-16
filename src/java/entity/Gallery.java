/**
 * Copyright (C) 2021, FPT University J3.L.P0017 Photographer
 *
 * Record of change: DATE Version Author DESCRIPTION 2021-05-13 1.0 NangNN First
 * Version
 */
package entity;

/**
 *
 * This class represents the Gallery table in database
 *
 * @author nangnnhe130538
 */
public class Gallery {

    /**
     * Gallery id
     */
    private int id;
    /**
     * Gallery name
     */
    private String name;
    /**
     * Gallery description
     */
    private String description;
    /**
     * Gallery image
     */
    private String image;

    /**
     * Constructor
     */
    public Gallery() {
    }

    /**
     * Constructor
     *
     * @param id. It is an int
     * @param name. It is a <code>java.lang.String</code>
     * @param description. It is a <code>java.lang.String</code>
     * @param image. It is a <code>java.lang.String</code>
     */
    public Gallery(int id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    /**
     * Get id. <br>
     *
     * @return id. It is an int
     */
    public int getId() {
        return id;
    }

    /**
     * Set id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get name. <br>
     *
     * @return name. It is a <code>java.lang.String</code>
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
