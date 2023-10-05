package com.example.utils

import android.util.Log

fun Any.logd(msg: String, tag: String = "RequestX") {
    Log.d(tag, msg)
}