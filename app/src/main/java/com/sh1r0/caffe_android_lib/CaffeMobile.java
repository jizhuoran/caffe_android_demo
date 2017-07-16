package com.sh1r0.caffe_android_lib;

import java.nio.charset.StandardCharsets;

public class CaffeMobile {
    private static byte[] stringToBytes(String s) {
        return s.getBytes(StandardCharsets.US_ASCII);
    }

    public native void setNumThreads(int numThreads);

    public native void enableLog(boolean enabled);  // currently nonfunctional

    public native int loadModel(String modelPath, String weightsPath);  // required

    private native void setMeanWithMeanFile(String meanFile);

    private native void setMeanWithMeanValues(float[] meanValues);

    public native void setScale(float scale);

    public native float[] getConfidenceScore(String data, int width, int height);


    public native int[] predictImage(String data, int k);


    public int[] predictImage(String imgPath) {
        return predictImage(imgPath, 1);
    }

    public native float[][] extractFeatures(String data, String blobNames);

    public void setMean(float[] meanValues) {
        setMeanWithMeanValues(meanValues);
    }

    public void setMean(String meanFile) {
        setMeanWithMeanFile(meanFile);
    }
}
