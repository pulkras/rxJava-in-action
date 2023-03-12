package ru.pulkras.subjects;


public class Main {
    public static void main(String[] args) {

        SubjectExample subjectExample = new SubjectExample();
        BehaviorSubjectExample behaviorSubjectExample = new BehaviorSubjectExample();
        ReplaySubjectExample replaySubjectExample = new ReplaySubjectExample();
        AsyncSubjectExample asyncSubjectExample = new AsyncSubjectExample();

        subjectExample.workWithSubject();
        behaviorSubjectExample.workWithBehaviorSubject();
        replaySubjectExample.workWithReplaySubject();
        asyncSubjectExample.workWithAsyncSubjects();

    }
}
