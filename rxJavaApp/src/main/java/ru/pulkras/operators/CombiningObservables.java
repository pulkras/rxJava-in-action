package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class CombiningObservables {

    Observable observable = (Observable) Observable.just(1, 2) // mergeWith
            .mergeWith(Observable.just(3, 4))
            .subscribe(item -> System.out.print(item + " ")); // 1 2 3 4

    public void zipWithMethod() {
        Observable firstObservable = Observable.just("A", "B");
        Observable secondObservable = Observable.just("C", "D");

        firstObservable.zipWith(secondObservable, (item1, item2) -> {
            return String.format("%s%s", item1, item2);
        }).subscribe(finalResult -> System.out.print(finalResult)); // AC BD
    }
}
