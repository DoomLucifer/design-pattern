package com.doom.lucifer.observer.delegate;

import java.util.Date;

/**
 * lucifer
 *
 * @author <a href="mailto:zhengguoqiang@58.com">doom</a>
 */
public class WatchNBAListener {

    public WatchNBAListener() {
        System.out.println(this.getClass().getSimpleName() +
                " 我正在看NBA，开始时间：" + new Date());
    }

    public void stopWatchingTV(Date date){
        System.out.println(this.getClass().getSimpleName() +
                " 老师来了，快关闭NBA直播，结束时间：" + date);
    }
}
