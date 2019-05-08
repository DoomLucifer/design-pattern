package com.doom.lucifer.observer.delegate;

import java.util.Date;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class WatchCartoonListener {

    public WatchCartoonListener() {
        System.out.println(this.getClass().getSimpleName() + " 我正在看漫画，开始时间：" + new Date());
    }

    public void stopPlayingGame(Date date){
        System.out.println(this.getClass().getSimpleName() + " 老师来了，" +
                "不要看漫画了，结束时间：" + date);
    }
}
