package com.smartshoping.ssmoble;

import java.util.ArrayList;

public class DummyItems {
    static ArrayList<DummyObject> x = new ArrayList<DummyObject>();
    static{
       x.add(new DummyObject("pie", "cambels", "walmart"));
        x.add(new DummyObject("milk", "dairy", "walmart"));
        x.add(new DummyObject("meat", "farms", "heb"));
        x.add(new DummyObject("eggs", "farms", "walmart"));
        x.add(new DummyObject("chicken", "farms", "cosco"));
    }

    static public class DummyObject{
        public String Name;
        public String Brand;
        public String Store;

        public DummyObject(String n, String b, String s){
            Name = n;
            Brand = b;
            Store = s;
        }

    }
}
