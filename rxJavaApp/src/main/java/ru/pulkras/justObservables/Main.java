package ru.pulkras.justObservables;

import ru.pulkras.completables.CompletableExample;
import ru.pulkras.coldAndHot.ColdObservable;
import ru.pulkras.coldAndHot.HotObservable;
import ru.pulkras.singleAndMaybe.MaybeObservable;
import ru.pulkras.singleAndMaybe.SingleObservable;
import ru.pulkras.syncAndAsync.SyncAndAsyncFlowables;
import ru.pulkras.syncAndAsync.SyncAndAsyncObservables;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JustObservable justObservable = new JustObservable();

        WorkWithStringType workWithStringType = new WorkWithStringType();
        WorkWithIntegerType workWithIntegerType = new WorkWithIntegerType();

        ObservableWithSubscribeOn observableWithSubscribeOn = new ObservableWithSubscribeOn();

        justObservable.workWithObservable();
        justObservable.observableWithIntegerRange();

        workWithStringType.observableAndObserverWithString();
        workWithIntegerType.observableAndObserverWithInteger();

//        justObservable.observableWithLongInterval();
//        justObservable.observableWithTimer();

        observableWithSubscribeOn.workWithSubscribeOn();

    }
}