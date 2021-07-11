package com.example.demo.website.pages;

import com.example.demo.db.IDbOps;
import com.example.demo.utils.Logger;

public class WebPage extends  Page {

    public static final String HELLO = "Hello";
    public static final String WORLD = "World";
    public static final String FOOTER = "footer";
    public static final String INISDE_WEB_PAGE_PUT_DATA = "Inisde web page putData";
    public static final Logger logger = Logger.getInstance();

    public WebPage(IDbOps iDbOps) {
        super(HELLO, WORLD, FOOTER, iDbOps);
    }

    @Override
    public void putData(String s) {
        System.out.println(logger);
        logger.log(INISDE_WEB_PAGE_PUT_DATA);
    }
}
