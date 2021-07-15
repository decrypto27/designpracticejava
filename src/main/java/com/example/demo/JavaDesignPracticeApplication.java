package com.example.demo;

import com.example.demo.bridge.*;
import com.example.demo.db.IDbOps;
import com.example.demo.db.InmemoryRw;
import com.example.demo.website.pages.Page;
import com.example.demo.website.pages.PageFactory;
import com.example.demo.website.pages.PageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.demo.bridge.ShapeType.CIRCLE;
import static com.example.demo.bridge.ShapeType.SQUARE;

@SpringBootApplication
public class JavaDesignPracticeApplication {

    public static final String WEBTABLE = "webtable";
    public static final String CONTACTTABLE = "contacttable";

    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Shape redCircle = new Circle(red, CIRCLE, 10);
        System.out.println(redCircle.getArea());
        System.out.println(redCircle.getType());

        Shape blueSquare = new Square(blue, SQUARE, 10);
        System.out.println(blueSquare.getArea());
        System.out.println(blueSquare.getType());


//        System.out.println("hello world");
//        IDbOps iDbOps = new InmemoryRw();
//        Page pp = PageFactory.getPage(PageType.WEB, iDbOps);
//        pp.putData("What's up");
//        pp.displayPage();
//        pp.write(WEBTABLE);
//        System.out.println(pp.read(WEBTABLE));
//
//        Page ppa = PageFactory.getPage(PageType.WEB, iDbOps);
//        ppa.putData("What's up");
//        ppa.displayPage();
//        ppa.write(WEBTABLE);
//        System.out.println(ppa.read(WEBTABLE));
//
//        Page sample = PageFactory.getPage(PageType.CONTACT, iDbOps);
//		sample.putData("What's up");
//		sample.displayPage();
//        sample.write(CONTACTTABLE);
//        System.out.println(ppa.read(CONTACTTABLE));

    }
}
