package ru.pulkras.singleAndMaybe;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

public class SingleObservable {

    public void exampleOfSingleObservable() {
        Single<String> single = createSingle();

        single.subscribe(new SingleObserver<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable e) {

            }

            @Override
            public void onSuccess(@NonNull String s) {
                System.out.println(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println(e.getMessage());
            }
        });
    }

    private Single<String> createSingle() {
        return Single.create(emitter -> {
            String user = fetchUser();

            if(user != null)
                emitter.onSuccess(user);
            else
                emitter.onError(new Exception("User not found"));
        });
    }

    private String fetchUser() {
//        return "Jong";
        return null;
    }
}
