package ru.pulkras;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

public class CompletableExample {

    public void exampleOfCompletable() {
        Completable completable = createCompletable();

        completable.subscribe(new CompletableObserver() {
            @Override
            public void onSubscribe(@NonNull Disposable e) {

            }
            @Override
            public void onComplete() {
                System.out.println("Operation is compoleted");
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }
        });
    }

    private Completable createCompletable() {
        return Completable.fromAction(deleteItemFromDBAction());
    }

    private Action deleteItemFromDBAction() {
        return new Action() {
            @Override
            public void run() throws Throwable {
                System.out.println("Deleting item from DB");
            }
        };
    }
}
