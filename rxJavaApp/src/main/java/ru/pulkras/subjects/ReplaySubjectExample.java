package ru.pulkras.subjects;

import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;

public class ReplaySubjectExample {

    private Subject<Integer> subject = ReplaySubject.create();

    public void workWithReplaySubject() {
        subject.subscribe(item -> System.out.println("Student A received " + item));

        subject.onNext(1);
        subject.onNext(2);
        subject.onNext(3);

        subject.subscribe(item -> System.out.println("Student B received " + item));
    }
}
