package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class ErrorHandlingOperators {
    Observable observable1 = (Observable) Observable.just(2, 1, 0) // retry
            .map(item -> 2 / item)
            .retry(1)
            .subscribe(item -> {
                System.out.print(item + " ");
            }, throwable -> System.out.println(throwable.getMessage())); // 1 2 1 2 / by zero

    Observable observable2 = (Observable) Observable.just(2, 1, 0) // onErrorReturnItem
            .map(item -> 2 / item)
            .onErrorReturnItem(-1)
            .subscribe(item -> System.out.print(item + " ")); // 1 2 -1

    Observable observable3 = (Observable) Observable.just(2, 1, 0) // onErrorResumeWith
            .map(item -> 2 / item)
            .onErrorResumeWith(Observable.just(5, 6, 7))
            .subscribe(item -> System.out.print(item + " ")); // 1 2 5 6 7
}
