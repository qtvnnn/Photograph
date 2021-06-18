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
 * This class used to contain attributes and methods getter, setter of <code>NumberOfViews</code> object
 * This class represents the <code>NumberOfViews</code> table in Database
 *
 * @author nangnnhe130538
 */
public class NumOfViews {

    /**
     * <code>NumberOfViews</code> numberOfviews
     */
    private int numberOfviews;

    /**
     * Constructor
     */
    public NumOfViews() {
    }

    /**
     * Constructor
     *
     * @param numberOfviews it is an <code>int</code>
     */
    public NumOfViews(int numberOfviews) {
        this.numberOfviews = numberOfviews;
    }

    /**
     * Get value from numberOfviews attribute of <code>NumberOfViews</code> class. <br>
     *
     * @return numberOfviews it is a <code>int</code>
     */
    public int getNumberOfviews() {
        return numberOfviews;
    }

    /**
     * Set value to numberOfviews attribute of <code>NumberOfViews</code> class
     *
     * @param numberOfviews it is a <code>int</code>
     */
    public void setNumberOfviews(int numberOfviews) {
        this.numberOfviews = numberOfviews;
    }

}
