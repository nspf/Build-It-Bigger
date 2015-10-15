package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.test.UiThreadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AsyncJokeDownloaderTest extends AndroidTestCase implements IDownloadListener {
    private AsyncJokeDownloader downloader;
    private CountDownLatch signal;
    private String joke;

    protected void setUp() throws Exception {
        super.setUp();

        signal = new CountDownLatch(1);
        downloader = new AsyncJokeDownloader(this);
    }

    @UiThreadTest
    public void testDownload() throws InterruptedException {
        downloader.download();
        signal.await(30, TimeUnit.SECONDS);
        assertTrue("joke is not null", this.joke != null);
        assertTrue("joke is not empty", !this.joke.isEmpty());
    }

    @Override
    public void downloadCompleted(String joke) {
        this.joke = joke;
        signal.countDown();
    }
}
