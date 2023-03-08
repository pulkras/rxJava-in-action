package ru.pulkras.coldAndHot;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ColdObservable coldObservable = new ColdObservable();
        HotObservable hotObservable = new HotObservable();

//        coldObservable.coldObservableExample();
        hotObservable.hotObservableExample();
    }
}
