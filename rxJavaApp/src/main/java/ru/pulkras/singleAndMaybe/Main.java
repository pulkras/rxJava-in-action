package ru.pulkras.singleAndMaybe;

public class Main {
    public static void main(String[] args) {
        SingleObservable singleObservable = new SingleObservable();
        MaybeObservable maybeObservable = new MaybeObservable();

        //        singleObservable.exampleOfSingleObservable();
        maybeObservable.exampleOfMaybeObserver();
    }
}
