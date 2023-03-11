package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class TransformingOperators {
    Observable observable1 = (Observable) Observable.just(1, 2, 3) // map
            .map(item -> String.valueOf(item))
            .subscribe(item -> System.out.print(item + " ")); // "1" "2" "3"
    Observable observable2 = (Observable) Observable.just(3, 2, 1) // sorted
            .sorted()
            .subscribe(item -> System.out.print(item + " ")); // 1 2 3

    Observable observable3 = (Observable) Observable.just(1, 2, 3) // scan
            .scan((accumulator, item) -> accumulator + item) // accumulator == index
            .subscribe(item -> System.out.print(item + " ")); // 1 3 6

    Observable observable4 = (Observable) Observable.range(0, 10) // buffer
            .buffer(3)
            .subscribe(item -> System.out.print(item + " ")); // [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]

    Observable observable5 = (Observable) Observable.just("a", "a", "bb", "bb", "bb", "ccc", "ccc") // groupBy
            .groupBy(item -> item.length())
            .flatMapSingle(group -> group.toList())
            .subscribe(item -> System.out.print(item + " ")); // [a, a] [bb, bb, bb] [ccc, ccc]

    Observable observable6 = (Observable) Observable.just(1, 2, 3) // flatMap
            .flatMap(item -> Observable.just(item * 2))
            .subscribe(item -> System.out.print(item + " ")); // 2 4 6

    Observable observable7 = (Observable) Observable.just(1, 2, 3) // toList
            .toList()
            .subscribe(item -> System.out.print(item + " ")); // [1, 2, 3]
}
