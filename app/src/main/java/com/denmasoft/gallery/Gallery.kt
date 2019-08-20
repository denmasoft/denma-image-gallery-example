package com.denmasoft.gallery

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize

@Parcelize
data class Gallery(val url: String) : Parcelable {

    companion object {
        fun getPictures(): Array<Gallery> {
            return arrayOf(Gallery("https://goo.gl/32YN2B"),
                Gallery("https://goo.gl/Wqz4Ev"),
                Gallery("https://goo.gl/U7XXdF"),
                Gallery("https://goo.gl/ghVPFq"),
                Gallery("https://goo.gl/qEaCWe"),
                Gallery("https://goo.gl/vutGmM"))
        }
    }
}
