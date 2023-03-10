package ru.pulkras.operators;

import io.reactivex.rxjava3.core.Observable;

public class TransformingOperators {
    Observable observable1 = (Observable) Observable.just(1, 2, 3) // map
            .map(item -> String.valueOf(item))
            .subscribe(item -> System.out.print(item + " ")); // "1" "2" "3"
    Observable observable12 = (Observable) Observable.just(3, 2, 1) // sorted
            .sorted()
            .subscribe(item -> System.out.print(item + " ")); // 1 2 3

    Observable observable3 = (Observable) Observable.just(1, 2, 3) // scan
            .scan((accumulator, item) -> accumulator + item) // accumulator == index
            .subscribe(item -> System.out.print(item + " ")); // 1 3 6
    
}
