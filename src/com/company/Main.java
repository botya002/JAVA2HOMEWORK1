package com.company;

public class Main {

    public static void main(String[] args) {

        Iphone objectA = new Iphone(" Apple ",Hotels.MAYAMI,
                " 11 pro max ");
        System.out.println(objectA.smartInfo());
        System.out.println(objectA.smartphoneInfo(23232434));



        Proverka_Studi objectB = new Proverka_Studi(" Apple ",Hotels.AMERIKA ,
                " 12 pro max "," Apple "," Iphone " );
        System.out.println(objectB.smartInfo());
        System.out.println(objectB.smartphoneInfo("12 pro max"));


        Proverka_Studi objectC = new Proverka_Studi(" Apple ",Hotels.SINGAPUR,
                " XR "," Apple "," Iphone " );
        System.out.println(objectC.smartInfo());


    }

}