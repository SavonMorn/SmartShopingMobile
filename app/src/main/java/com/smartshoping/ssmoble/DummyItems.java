package com.smartshoping.ssmoble;

import java.util.ArrayList;

public class DummyItems {
    static ArrayList<DummyObject> x = new ArrayList<DummyObject>();
    static{
       x.add(new DummyObject("Condensed Chicken Noodle Soup", "Campbell's", "Walmart"));
        x.add(new DummyObject("2% Reduced-Fat Milk", "Great Value", "Walmart"));
        x.add(new DummyObject("Thick Cut Bacon", "Hormel", "H.E.B"));
        x.add(new DummyObject("Large White Eggs, 18", "Great Value", "Walmart"));
        x.add(new DummyObject("Boneless Skinless Chicken Breasts", "Member's Mark", "Sam's Club"));
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
