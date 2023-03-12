package ru.pulkras.subjects;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.concurrent.TimeUnit;

public class SubjectExample {

    private Observable<Long> source1 = Observable.interval(1, TimeUnit.SECONDS);
    private Observable<Long> source2 = Observable.interval(1, TimeUnit.SECONDS);

    private Subject<Long> subject = PublishSubject.create();

    public void workWithSubject() {
        subject.subscribe(item -> System.out.println("Received item " + item));

        source1.subscribe(subject);
        source2.subscribe(subject);

        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
