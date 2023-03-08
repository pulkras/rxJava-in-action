package ru.pulkras.coldAndHot;

import io.reactivex.rxjava3.core.Observable;

public class ColdObservable {

    public void coldObservableExample() {
        Observable observable = Observable.just("a", "b", "c");

        observable.subscribe((item) -> System.out.println("Observer 1 - " + item));
        observable.subscribe((item) -> System.out.println("Observer 2 - " + item));
        observable.subscribe((item) -> System.out.println("Observer 3 - " + item));


    }
}
