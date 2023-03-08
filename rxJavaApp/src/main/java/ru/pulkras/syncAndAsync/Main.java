package ru.pulkras.syncAndAsync;

public class Main {
    public static void main(String[] args) {
        SyncAndAsyncObservables syncAndAsyncObservables = new SyncAndAsyncObservables();
        SyncAndAsyncFlowables flowableExample = new SyncAndAsyncFlowables();

        syncAndAsyncObservables.synchronousObservableExample();
//        syncAndAsyncObservables.asyncObservableExample();

//        flowableExample.synchronousFlowableExample();
        flowableExample.asyncFlowableExample();
    }
}
