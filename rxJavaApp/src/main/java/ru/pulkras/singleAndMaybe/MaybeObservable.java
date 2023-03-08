package ru.pulkras.singleAndMaybe;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;

public class MaybeObservable {

    public void exampleOfMaybeObserver() {
        Maybe<String> maybe = createMaybe();
        maybe.subscribe(new MaybeObserver<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable e) {

            }

            @Override
            public void onSuccess(@NonNull String e) {
                System.out.println(e);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("no new content");
            }
        });


    }
    private Maybe<String> createMaybe() {
         return Maybe.create(emitter -> {
             var newContent = readFile();

             if(newContent != null) {
                 emitter.onSuccess(newContent);
             }
             else {
                 emitter.onComplete();
             }
         });
    }

    private String readFile() {
//        return "new content is here";
        return null;
    }
}
