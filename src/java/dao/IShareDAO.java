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

import entity.Share;
import java.util.ArrayList;

/**
 * The interface of <code>ShareDAOImpl</code> class defines methods to help us 
 * manipulate <code>Share</code> object from <code>Share</code> tables in database.
 *
 * @author nangnnhe130538
 */
public interface IShareDAO {

    /**
     * Get all <code>Share</code> options according in the database.
     *
     * @return a list <code>Share</code> object
     * @throws Exception
     */
    public ArrayList<Share> getShare() throws Exception;
}
