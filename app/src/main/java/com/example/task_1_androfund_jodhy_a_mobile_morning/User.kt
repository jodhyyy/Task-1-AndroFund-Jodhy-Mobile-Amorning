package com.example.task_1_androfund_jodhy_a_mobile_morning

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(
    val username:String,
    val password:String
):Parcelable