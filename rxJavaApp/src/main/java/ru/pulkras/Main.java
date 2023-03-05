package ru.pulkras;

import io.reactivex.rxjava3.core.Observable;

public class Main {
    public static void main(String[] args) {
        Observable<String> observable = Observable.create(emitter -> {
                emitter.onNext("Click 1");
                emitter.onNext("Click 2");
                emitter.onNext("Click 3");
//                throw new Exception("just a error");
                emitter.onComplete();
        });

        observable.subscribe(item -> {
            System.out.println(item);
        }, throwable -> {
            System.out.println(throwable.getMessage());
        }, () -> {
            System.out.println("On complete");
        });
    }
}