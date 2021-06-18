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

import entity.ImageGallery;
import java.util.ArrayList;

/**
 * The interface of <code>ImageGalleryDAOImpl</code> class defines methods to help us 
 * manipulate <code>ImageGallery</code> object from <code>ImageGallery</code> tables in database.
 *
 * @author nangnnhe130538
 */
public interface IImageGalleryDAO {

    /**
     * Get all <code>ImageGallery</code> options according in the database and paging
     *
     * @param id it is an <code>int</code>.
     * @param pageSize it is an <code>int</code>.
     * @param pageIndex it is an <code>int</code>.
     * @return a list <code>ImageGallery</code> object
     * @throws Exception
     */
    public ArrayList<ImageGallery> getImageGalleryPaging(int id, int pageSize, int pageIndex) throws Exception;

    /**
     * Get number of <code>ImageGallery</code> options according in the database
     *
     * @param id it is an <code>int</code>.
     * @param pageSize it is an <code>int</code>.
     * @return an <code>int</code>.
     * @throws Exception
     */
    public int getNumberPages(int id, int pageSize) throws Exception;

}
