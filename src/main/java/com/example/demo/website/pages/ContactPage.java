package com.example.demo.website.pages;

import com.example.demo.db.IDbOps;
import com.example.demo.utils.Logger;

public class ContactPage extends Page {

    public static final String CONTACT = "Contact";
    public static final String US = "Us";
    public static final String PAGE_FOOTER = "999999";
    public static final Logger logger = Logger.getInstance();

    public ContactPage(final IDbOps iDbOps) {
        super(CONTACT, US, PAGE_FOOTER, iDbOps);
    }

    @Override
    public void putData(String s){
        System.out.println(logger);
        logger.log("Inisde contact page putData");
    }
}
