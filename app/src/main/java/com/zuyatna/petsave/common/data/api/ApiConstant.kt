package com.zuyatna.petsave.common.data.api

import com.zuyatna.petsave.BuildConfig

object ApiConstant {
    const val BASE_ENDPOINT = "https://api.petfinder.com/v2/"
    const val AUTH_ENDPOINT = "oauth2/token/"
    const val ANIMAL_ENDPOINT = "animals"

    const val KEY = BuildConfig.API_KEY
    const val SECRET = BuildConfig.SECRET
}