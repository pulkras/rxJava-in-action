package ru.pulkras.justObservables;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;

public class WorkWithIntegerType {
    public void observableAndObserverWithInteger() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        Observable<Integer> observable = Observable.fromIterable(numbers);

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println(integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("On complete called");
            }
        };

        observable.subscribe(observer);
    }
}
