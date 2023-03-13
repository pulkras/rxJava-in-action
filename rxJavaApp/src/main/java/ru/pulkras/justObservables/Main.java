package ru.pulkras.justObservables;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JustObservable justObservable = new JustObservable();

        WorkWithStringType workWithStringType = new WorkWithStringType();
        WorkWithIntegerType workWithIntegerType = new WorkWithIntegerType();

        ObservableWithSubscribeOn observableWithSubscribeOn = new ObservableWithSubscribeOn();
        ObservableWithObserveOn observalbeWithObserveOn = new ObservableWithObserveOn();

        justObservable.workWithObservable();
        justObservable.observableWithIntegerRange();

        workWithStringType.observableAndObserverWithString();
        workWithIntegerType.observableAndObserverWithInteger();

//        justObservable.observableWithLongInterval();
//        justObservable.observableWithTimer();

        observableWithSubscribeOn.workWithSubscribeOn();
        observalbeWithObserveOn.observeOnExample();

    }
}