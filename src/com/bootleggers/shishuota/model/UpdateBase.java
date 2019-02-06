/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bootleggers.shishuota.model;

public class UpdateBase implements UpdateBaseInfo {

    private String mName;
    private String mDownloadId;
    private String mDownloadUrl;
    private String mDownloadMirror;
    private String mBuildDate;
    private String mXdaThread;
    private long mFileSize;

    public UpdateBase() {
    }

    public UpdateBase(UpdateBaseInfo update) {
        mName = update.getName();
        mDownloadId = update.getDownloadId();
        mDownloadUrl = update.getDownloadUrl();
        mDownloadMirror = update.getDownloadMirror();
        mBuildDate = update.getBuildDate();
        mXdaThread = update.getXdaThread();
        mFileSize = update.getFileSize();
    }

    @Override
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String getDownloadId() {
        return mDownloadId;
    }

    public void setDownloadId(String downloadId) {
        mDownloadId = downloadId;
    }


    @Override
    public String getDownloadMirror() {
        return mDownloadMirror;
    }

    public void setDownloadMirror(String downloadMirror) {
        mDownloadMirror = downloadMirror;
    }

    @Override
    public String getBuildDate() {
        return mBuildDate;
    }

    public void setBuildDate(String buildate) {
        mBuildDate = buildate;
    }

    @Override
    public String getXdaThread() {
        return mXdaThread;
    }

    public void setXdaThread(String xdathread) {
        mXdaThread = xdathread;
    }

    @Override
    public String getDownloadUrl() {
        return mDownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        mDownloadUrl = downloadUrl;
    }

    @Override
    public long getFileSize() {
        return mFileSize;
    }

    public void setFileSize(long fileSize) {
        mFileSize = fileSize;
    }
}
