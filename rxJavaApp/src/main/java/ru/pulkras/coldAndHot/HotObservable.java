package ru.pulkras.coldAndHot;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class HotObservable {

    public void hotObservableExample() throws InterruptedException {
        ConnectableObservable observable = Observable.interval(1, TimeUnit.SECONDS)
                .publish();
        observable.connect();

        observable.subscribe((item) -> {
            System.out.println("Observer 1, sec: " + item);
        });

        Thread.sleep(5000);
    }
}
