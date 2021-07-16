package com.example.demo;

import com.example.demo.decorator.*;
import com.example.demo.prototype.Cosmetic;
import com.example.demo.prototype.Registry;
import com.example.demo.prototype.Surgical;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDesignPracticeApplication {

    public static final String WEBTABLE = "webtable";
    public static final String CONTACTTABLE = "contacttable";

    public static void main(String[] args) {
        Coffee coffee = new WhippedCreamDecorator(new ChocoChipDecorator(new MochaCofee()));
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Coffee doublewobble = new ChocoChipDecorator(new ChocoChipDecorator (new WhippedCreamDecorator(new BlackCoffee())));
        System.out.println(doublewobble.getName());
        System.out.println(doublewobble.getPrice());

        //===================================== Prototype =================================
//        Registry registry = new Registry();
//        Cosmetic cosmetic = (Cosmetic) registry.createItem("cosmetic");
//        System.out.println(cosmetic.getName());
//        System.out.println(cosmetic);
//
//        Surgical surgical = (Surgical) registry.createItem("surgical");
//        System.out.println(surgical.getName());
//        System.out.println(surgical);
        //===================================== Bridge =================================
//        Color red = new Red();
//        Color blue = new Blue();
//        Shape redCircle = new Circle(red, CIRCLE, 10);
//        System.out.println(redCircle.getArea());
//        System.out.println(redCircle.getType());
//
//        Shape blueSquare = new Square(blue, SQUARE, 10);
//        System.out.println(blueSquare.getArea());
//        System.out.println(blueSquare.getType());
        //===================================== Bridge =================================

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
