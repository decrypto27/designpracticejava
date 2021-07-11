package com.example.demo.website.pages;

import com.example.demo.db.IDbOps;

public abstract class Page {
    public static final String DELIMITER = " ";
    String pageHeader;
    String pageContent;
    String pageFooter;
    IDbOps iDbOps;

    public Page(String pageHeader, String pageContent, String pageFooter, IDbOps iDbOps) {
        this.pageHeader = pageHeader;
        this.pageContent = pageContent;
        this.pageFooter = pageFooter;
        this.iDbOps = iDbOps;
    }

    public abstract void putData(String s);

    public void displayPage() {
        System.out.println(pageHeader + DELIMITER + pageContent + DELIMITER + pageFooter);
    }

    public void write(String tableName) {
        iDbOps.put(this, tableName);
    }

    public String read(String tableName) {
        return iDbOps.get(tableName);
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageHeader='" + pageHeader + '\'' +
                ", pageContent='" + pageContent + '\'' +
                ", pageFooter='" + pageFooter + '\'' +
                '}';
    }
}
