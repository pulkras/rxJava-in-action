package ru.pulkras.subjects;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class BehaviorSubjectExample {
    private Subject<Integer> subject = BehaviorSubject.create();

    public void workWithBehaviorSubject() {
        subject.subscribe(item -> System.out.println("Person 1 listens to song: " + item));

        subject.onNext(1);
        subject.onNext(2);
        subject.onNext(3);

        subject.subscribe(item -> System.out.println("Person 2 listens to song: " + item));
    }
}
