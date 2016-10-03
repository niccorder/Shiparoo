package com.shiparoo.domain.interactors.base;

import com.shiparoo.domain.executor.MainThread;
import com.shiparoo.domain.executor.NetworkExecutor;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

public abstract class AbstractInteractor {

    private final NetworkExecutor threadExecutor;
    private final MainThread      mainThread;

    private Subscription subscription = Subscriptions.empty();

    protected AbstractInteractor(NetworkExecutor threadExecutor,
                      MainThread mainThread) {
        this.threadExecutor = threadExecutor;
        this.mainThread = mainThread;
    }

    protected abstract Observable buildUseCaseObservable();

    @SuppressWarnings("unchecked")
    public void execute(Subscriber interactorSubscriber) {
        this.subscription = this.buildUseCaseObservable()
                                .subscribeOn(Schedulers.from(threadExecutor))
                                .observeOn(mainThread.getScheduler())
                                .subscribe(interactorSubscriber);
    }

    public void unsubscribe() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}
