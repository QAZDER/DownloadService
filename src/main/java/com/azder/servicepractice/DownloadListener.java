package com.azder.servicepractice;

/**
 * Created by zhou6 on 2017/2/14.
 */
public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();
}
