package ru.pulkras.justObservables;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ObservableWithObserveOn {

    public void observeOnExample() {
        Observable.just("Hello world")
                .subscribeOn(Schedulers.io())
                .doOnNext(item -> System.out.println("Emitting item: " + Thread.currentThread().getName()))
                .observeOn(Schedulers.single())
                .subscribe(item -> System.out.println("Observing item: " + Thread.currentThread().getName()));

        try {
            Thread.sleep(100000);
        } catch(InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
