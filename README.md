caffe-android-demo(This repo is forked from https://github.com/sh1r0/caffe-android-demo with only minor modification, please star them!)
==================
An android caffe demo app exploiting caffe pre-trained ImageNet model for image classification

## Quick Start

### Basic

If you want to have a try on this app, please follow the steps below to get the required stuff:
```shell
# 1. get caffe if you don't have one
git clone https://github.com/BVLC/caffe.git
# 2. download model (bvlc_reference_caffenet is used)
cd caffe
./scripts/download_model_binary.py models/bvlc_reference_caffenet/
# 3. change the deply.prototxt in models/bvlc_reference_caffenet/ by our_repo/caffe_mobile/bvlc_reference_caffenet/deply.prototxt
# 4. push things to your device
adb shell mkdir -p /sdcard/caffe_mobile/
adb push models/bvlc_reference_caffenet/ /sdcard/caffe_mobile/bvlc_reference_caffenet/


```
If the app crashes, first make sure it is not an out of memory issue - modify deploy.prototxt such that the mini batch size is 1 instead of 10
