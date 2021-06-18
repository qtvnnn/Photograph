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

import entity.Information;

/**
 * The interface of <code>InfomationDAOImpl</code> class defines methods to help us 
 * manipulate <code>Infomation</code> object from <code>Infomation</code> tables in database.
 *
 * @author nangnnhe130538
 */
public interface IInfomationDAO {

    /**
     * Get all <code>Infomation</code> options according in the database.
     *
     * @return a list <code>Information</code> object
     * @throws Exception
     */
    public Information getInfor() throws Exception;
}
