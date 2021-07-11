package com.example.demo.db;

import com.example.demo.website.pages.Page;

public interface IDbOps {
    void put(Page page, String table);
    String get(String input);
}
