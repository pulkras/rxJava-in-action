package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class FilteringOperators {
        Observable observable1 = (Observable) Observable.just("hello", "my", "world") // filter
                .filter(item -> item.length() != 2)
                .subscribe(item -> System.out.print(item + " ")); // hello world

        Observable observable2 = (Observable) Observable.just("hello", "my", "world") // take
                .take(2)
                .subscribe(item -> System.out.print(item + " ")); // hello my

        Observable observable3 = (Observable) Observable.just("hello", "my", "world") // skip
                .skip(2)
                .subscribe(item -> System.out.print(item + " ")); // world

        Observable observable4 = (Observable) Observable.just("hello", "my", "world") // distinct
                .distinct()
                .subscribe(item -> System.out.print(item + " ")); // hello

        Observable observable5 = (Observable) Observable.just(2, 3, 4, 5) // first
                .first(-1)
                .subscribe(item -> System.out.print(item + " ")); // 2

        Observable observable6 = (Observable) Observable.just(2, 3, 4, 5) // last
                .last(-1)
                .subscribe(item -> System.out.print(item + " ")); // 5

}
