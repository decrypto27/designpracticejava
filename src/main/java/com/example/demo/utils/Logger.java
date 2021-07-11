package com.example.demo.utils;

public class Logger {
    private Logger(){

    }
    private static Logger logger = null;
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String input){
        System.out.println(input);
    }
}
