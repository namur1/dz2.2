package com.company;

public class Main {

    public static void main(String[] args) {
        
            Dad[] arrayDad = {createObject("Eldest_Son"), createObject("Daughter"), createObject("Younger_Son")};
            for (Dad a : arrayDad) {
                a.print();

            }

        }

        public static Dad createObject(String className) {
            switch (className) {
                case "Eldest_Son":
                    Eldest_Son dimon = new Eldest_Son(19, "Dimon", 185);
                    return dimon;
                case "Daughter":
                    Daughter ksusha = new Daughter(13, "Ksusha", "drawing");
                    return ksusha;
                case "Younger_Son":
                    Younger_Son misha = new Younger_Son(8, "Misha", "Samsung");
                    return misha;
            }
            return null;
        }
}
