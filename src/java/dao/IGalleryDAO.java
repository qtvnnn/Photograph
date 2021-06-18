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

import entity.Gallery;
import java.util.ArrayList;

/**
 * The interface of <code>GalleryDAOImpl</code> class defines methods to help us 
 * manipulate <code>Gallery</code> object from <code>Gallery</code> tables in database.
 * 
 * @author nangnnhe130538
 */
public interface IGalleryDAO {

    /**
     * Get top 3 <code>Galleries</code> options according in the database
     *
     * @param top it is an <code>int</code>
     * @return a list <code>Gallery</code> object
     * @throws Exception
     */
    public ArrayList<Gallery> getTopGalleries(int top) throws Exception;

    /**
     * Get all <code>Galleries</code> options according in the database and paging
     *
     * @param pageSize. It is an <code>int</code>.
     * @param pageIndex. It is an <code>int</code>.
     * @return a list <code>Gallery</code> object
     * @throws Exception
     */
    public ArrayList<Gallery> getGalleries(int pageSize, int pageIndex) throws Exception;

    /**
     * Get number of <code>Galleries</code> options according in the database
     *
     * @param pageSize. It is an <code>int</code>.
     * @return an <code>int</code>.
     * @throws Exception
     */
    public int getNumberPages(int pageSize) throws Exception;

    /**
     * Get a <code>Galleries</code> option according in the database by Gallery id
     *
     * @param id. It is an <code>int</code>.
     * @return a <code>Gallery</code> object
     * @throws Exception
     */
    public Gallery getGalleryByID(int id) throws Exception;

}
