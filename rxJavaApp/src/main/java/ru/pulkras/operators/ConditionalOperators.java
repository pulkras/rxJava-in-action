package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class ConditionalOperators {
    Observable observable1 = (Observable) Observable.just(2, 3, 4, 5) // takeWhile
            .takeWhile(item -> item <= 3)
            .subscribe(item -> System.out.print(item + " ")); // 2 3

    Observable observable2 = (Observable) Observable.just(2, 3, 4, 5) // skipWhile
            .skipWhile(item -> item < 4)
            .subscribe(item -> System.out.print(item + " ")); // 4 5

    Observable observable3 = (Observable) Observable.just("jack", "tuck", "luck") // all
            .all(item -> item.length() == 4)
            .subscribe(item -> System.out.println(item)); // true

    Observable observable4 = (Observable) Observable.just("jack", "tuck", "luck") // any
            .any(item -> item.length() == 3)
            .subscribe(item -> System.out.println(item)); // false

    Observable observable5 = (Observable) Observable.just("jack", "tuck", "luck") // defaultIffEmpty
            .filter(item -> item.length() == 3)
            .defaultIfEmpty("ABC")
            .subscribe(item -> System.out.println(item)); // ABC

    Observable observable6 = (Observable) Observable.just("jack", "tuck", "luck") // switchIfEmpty
            .filter(item -> item.length() == 3)
            .switchIfEmpty(Observable.just("hello", "world"))
            .subscribe(item -> System.out.print(item + " ")); // // hello world
}
