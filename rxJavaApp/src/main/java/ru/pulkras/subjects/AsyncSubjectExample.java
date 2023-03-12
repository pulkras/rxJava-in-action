package ru.pulkras.subjects;

import io.reactivex.rxjava3.subjects.AsyncSubject;

public class AsyncSubjectExample {

    private AsyncSubject<Integer> subject = AsyncSubject.create();

    public void workWithAsyncSubjects() {
        subject.subscribe(item -> System.out.println("Student C received " + item));

        subject.onNext(1);
        subject.onNext(2);
        subject.onNext(3);

        subject.subscribe(item -> System.out.println("Student D received " + item));

        subject.onNext(4);
        subject.onNext(5);

        subject.onComplete();

    }
}
