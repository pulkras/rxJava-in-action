package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class UtilityOperators {

    Observable observable1 = (Observable) Observable.just("Hello world") // delay
            .delay(2, TimeUnit.SECONDS)
            .subscribe(item -> System.out.println(item)); // after two seconds it prints Hello world

    Observable observable2 = (Observable) Observable.just("Hello world") // timeout
            .timeout(1, TimeUnit.SECONDS)
            .subscribe(item -> {
                System.out.println(item);
            }); // it prints Hello world

    Observable observable3 = (Observable) Observable.just(1, 2) // doOnNext
            .doOnNext(item -> System.out.println("Log some info"))
            .filter(item -> item == 2)
            .subscribe(item -> {
                System.out.print(item + "|");
            }); // log some info|log some info|2

    Observable observable4 = (Observable) Observable.timer(1, TimeUnit.SECONDS) // doOnDispose
            .doOnDispose(() -> System.out.println("Disposed called"))
            .subscribe(item -> {
                System.out.print(item + "|");
            }); // Disposed called

    public void observeOnMethod() {
        System.out.println(Thread.currentThread().getName());
        Observable observable = (Observable) Observable.just("Hello world")
                .observeOn(Schedulers.newThread())
                .subscribe(item -> {System.out.println(Thread.currentThread().getName());
                    System.out.println(item);}); // prints
                                                 // main
                                                 // RxNewThreadScheduler-1
                                                 // Hello world
    }

    public void subscribeOnMethod() {
        System.out.println(Thread.currentThread().getName());
        Observable observable = (Observable) Observable.just("Hello world")
                .subscribeOn(Schedulers.newThread()) // change the thread where we produce items
                .subscribe(item -> {System.out.println(Thread.currentThread().getName());
                    System.out.println(item);}); // prints
                                                 // main
                                                 // RxNewThreadScheduler-1
                                                 // Hello world
    }


}
