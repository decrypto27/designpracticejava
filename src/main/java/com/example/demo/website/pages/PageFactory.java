package com.example.demo.website.pages;

import com.example.demo.db.IDbOps;

public class PageFactory {
    private PageFactory(){

    }
    public static Page getPage(final PageType pageType, final IDbOps iDbOps) {
        Page page = null;
        switch(pageType){
            case WEB:{
                page = new webpage(iDbOps);
                break;
            }
            case CONTACT:{
                page = new contactpage(iDbOps);
                break;
            }
            default:{
                break;
            }
        }
        return page;
    }
}
