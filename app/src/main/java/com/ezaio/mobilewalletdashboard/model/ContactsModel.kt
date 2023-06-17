package com.ezaio.mobilewalletdashboard.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @auther dustin.hsieh
 * @Date on 2023/6/16
 * @Description
 */
@Parcelize
class ContactsModel(
    var name:String,
    var picAddress:String,
):Parcelable {

}