/*
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        NangNN           First Version<br>
 */
package dao;

/**
 * The interface of <code>NumberOfViewsDAOImpl</code> class defines methods to help us 
 * manipulate <code>NumberOfViews</code> object from <code>NumberOfViews</code> tables in database.
 *
 * @author nangnnhe130538
 */
public interface INumberOfViewsDao {

    /**
     * Get number of view from <code>NumberOfViews</code> table in database
     *
     * @return number of view 
     * @throws java.lang.Exception
     */
    public int getNumber() throws Exception;

    /**
     * Update number of view when user access web page many times
     *
     * @throws java.lang.Exception
     */
    public void updateNumber() throws Exception;

}
