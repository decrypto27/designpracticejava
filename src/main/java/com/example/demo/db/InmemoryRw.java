package com.example.demo.db;

import com.example.demo.website.pages.Page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InmemoryRw implements IDbOps {
    Map<String,List<String>> db;

    public InmemoryRw() {
        this.db = new HashMap<>();
    }

    @Override
    public void put(Page page, String tableName){
        List<String> mps;
        if (db.get(tableName) == null) {
            mps = new ArrayList<>();
        } else{
            mps = db.get(tableName);
        }
        mps.add(page.toString());
        db.put(tableName,mps);
    }

    @Override
    public String get(String tableName){
        List<String> pages =  db.get(tableName);
        StringBuilder bb = new StringBuilder();
        for (String page : pages) {
            bb.append(page);
        }
        return bb.toString();
    }
}
