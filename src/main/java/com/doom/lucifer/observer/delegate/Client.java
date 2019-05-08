package com.doom.lucifer.observer.delegate;

import java.util.Date;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class Client {
    public static void main(String[] args) {
        Notifier notifier = new GoodNotifier();

        WatchCartoonListener watchCartoonListener = new WatchCartoonListener();
        WatchNBAListener watchNBAListener = new WatchNBAListener();
        notifier.addListener(watchCartoonListener,"stopPlayingGame",new Date());
        notifier.addListener(watchNBAListener,"stopWatchingTV",new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifier.notifyX();
    }
}
