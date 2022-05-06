package com.example.airplaneinfo;

public class AirplaneInfo {

    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        int c = 40;
        printAirplaneInfo("Тип самолета: Jet, модель: F-22 Raptor");
        printAirplaneInfo("Тип самолета: AirBus, модель: A320, кол. пасажиров эконом класса: " + a);
        printAirplaneInfo("Тип самолета: Boeing, модель: Boeing 777, кол. пасажиров эконом класса: " + b + ", пассажиров бизнес класса: " + c);

    }
        public static void printAirplaneInfo(String s){
        System.out.println(s);
        }

        public static void printAirplaneInfo(String s,Integer a){
        System.out.println(s);
    }

        public static void printAirplaneInfo(String a,Integer b,String s,Integer c){
        System.out.println(a);
        System.out.println(s);
    }
}

