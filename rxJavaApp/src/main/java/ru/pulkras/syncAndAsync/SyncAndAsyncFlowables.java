package ru.pulkras.syncAndAsync;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import static java.lang.Thread.sleep;

public class SyncAndAsyncFlowables {

    public void synchronousFlowableExample() {
        Flowable.range(1, 1000000)
                .map(id -> new MyItem(id))
                .subscribe(item -> {
                    sleep(20);
                    System.out.println("Received MyItem " + item.id + "\n");
                });
    }

    public void asyncFlowableExample() {
        Flowable.range(1, 1000000)
                .map(MyItem::new)
                .observeOn(Schedulers.io())
                .subscribe(item -> {
                    sleep(20);
                    System.out.println("Received MyItem " + item.id + "\n");
                });
    }


}
