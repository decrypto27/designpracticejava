package com.example.demo.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    public static final String DENTAL_IMPLANT = "dental implant";
    public static final String CHISEL = "Chisel";
    public static final String AMPUTEE_ARM = "AMputee arm";
    public Map<String, Items> registry = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Items createItem(String input) {
        try {
            Items items = registry.get(input);
            return (Items) items.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    void loadItems() {
        Prosthetic prosthetic = new Prosthetic(AMPUTEE_ARM, 100);
        Surgical surgical = new Surgical(CHISEL, 2000);
        Cosmetic cosmetic = new Cosmetic(DENTAL_IMPLANT, 3000);

        System.out.println(prosthetic);
        System.out.println(surgical);
        System.out.println(cosmetic);
        registry.put("surgical", surgical);
        registry.put("cosmetic", cosmetic);
        registry.put("prosthetic", prosthetic);
    }
}
