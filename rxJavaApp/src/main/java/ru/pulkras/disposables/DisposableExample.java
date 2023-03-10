package ru.pulkras.disposables;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.ResourceObserver;

import java.util.concurrent.TimeUnit;

public class DisposableExample {

    public void firstDisposableExample() {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable = seconds.subscribe(l -> System.out.println("Item " + l));

        if(disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    public void secondDisposableExample() {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

        CompositeDisposable compositeDisposable = new CompositeDisposable();

        seconds.subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                compositeDisposable.add(d);
            }

            @Override
            public void onNext(@NonNull Long item) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        compositeDisposable.dispose();
    }

    public void thirdDisposableExample() {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

        ResourceObserver<Long> resourceObserver = new ResourceObserver<Long>() {
            @Override
            public void onNext(@NonNull Long item) {
                System.out.println("item " + item);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        seconds.subscribe(resourceObserver);
        resourceObserver.dispose();
    }
}
