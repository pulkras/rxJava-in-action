package ru.pulkras.justObservables;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JustObservable {

    public void workWithObservable() {
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
    public void observableWithIntegerRange() {
        Observable<Integer> observable = Observable.range(2,5);
        observable.subscribe(item -> {
            System.out.println(item);
        });
    }

    public void observableWithLongInterval() {
        Observable<Long> intervalObservable = Observable.interval(1, TimeUnit.SECONDS);

        intervalObservable.subscribe(item -> {
            System.out.println(item);
        });

        new Scanner(System.in).nextLine();
    }

    public void observableWithTimer() {
        Observable<Long> timeObservable = Observable.timer(5, TimeUnit.SECONDS);

        timeObservable.subscribe(item -> {
            System.out.println("5 seconds passed");
        });

        Action action = () -> System.out.println("Hello world");

        Completable completable = Completable.fromAction(action);

        completable.subscribe(() -> {
            System.out.println("Action ends");
        });

        new Scanner(System.in).nextLine();
    }
}
