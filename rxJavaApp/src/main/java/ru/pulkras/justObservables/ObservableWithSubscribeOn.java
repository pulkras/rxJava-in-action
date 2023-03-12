package ru.pulkras.justObservables;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ObservableWithSubscribeOn {


    public void workWithSubscribeOn() {
        Observable.just(1, 2, 3, 4, 5)
                .doOnNext(item -> System.out.println("Pushing item " + item + " on " + Thread.currentThread().getName() + " thread"))
                .subscribeOn(Schedulers.computation())
                .subscribe(item -> {
                    System.out.println("Received item " + item + " on " + Thread.currentThread().getName() + " thread");
                });
//        try {
//            Thread.sleep(10000);
//        } catch(InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
