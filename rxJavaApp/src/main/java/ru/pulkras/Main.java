package ru.pulkras;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JustObservable justObservable = new JustObservable();
        WorkWithStringType workWithStringType = new WorkWithStringType();
        WorkWithIntegerType workWithIntegerType = new WorkWithIntegerType();
        SingleObservable singleObservable = new SingleObservable();
        MaybeObservable maybeObservable = new MaybeObservable();
        CompletableExample completableExample = new CompletableExample();


        justObservable.workWithObservable();
        justObservable.observableWithIntegerRange();

        workWithStringType.observableAndObserverWithString();
        workWithIntegerType.observableAndObserverWithInteger();

//        justObservable.observableWithLongInterval();
//        justObservable.observableWithTimer();

//        singleObservable.exampleOfSingleObservable();
        maybeObservable.exampleOfMaybeObserver();

        completableExample.exampleOfCompletable();
    }
}