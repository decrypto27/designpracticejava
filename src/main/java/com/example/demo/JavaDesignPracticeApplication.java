package com.example.demo;

import com.example.demo.db.IDbOps;
import com.example.demo.db.InmemoryRw;
import com.example.demo.website.pages.Page;
import com.example.demo.website.pages.PageFactory;
import com.example.demo.website.pages.PageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDesignPracticeApplication {

    public static final String WEBTABLE = "webtable";
    public static final String CONTACTTABLE = "contacttable";

    public static void main(String[] args) {
        System.out.println("hello world");
        IDbOps iDbOps = new InmemoryRw();
        Page pp = PageFactory.getPage(PageType.WEB, iDbOps);
        pp.putData("What's up");
        pp.displayPage();
        pp.write(WEBTABLE);
        System.out.println(pp.read(WEBTABLE));

        Page ppa = PageFactory.getPage(PageType.WEB, iDbOps);
        ppa.putData("What's up");
        ppa.displayPage();
        ppa.write(WEBTABLE);
        System.out.println(ppa.read(WEBTABLE));

        Page sample = PageFactory.getPage(PageType.CONTACT, iDbOps);
		sample.putData("What's up");
		sample.displayPage();
        sample.write(CONTACTTABLE);
        System.out.println(ppa.read(CONTACTTABLE));

    }
}
