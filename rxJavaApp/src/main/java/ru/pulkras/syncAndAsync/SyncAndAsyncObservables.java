package ru.pulkras.syncAndAsync;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import static java.lang.Thread.sleep;

public class SyncAndAsyncObservables {

    public void synchronousObservableExample() {
        Observable.range(1, 1000000)
                .map(id -> new MyItem(id))
                .subscribe(item -> {
                    sleep(1000);
                    System.out.println("Received Item " + item.id + "\n");
                });
    }

    public void asyncObservableExample() {
        Observable.range(1, 1000000)
                .map(MyItem::new)
                .observeOn(Schedulers.io())
                .subscribe(item -> {
                    sleep(1000);
                    System.out.println("Received Item " + item.id + "\n");
                });
    }
}
