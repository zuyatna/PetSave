package com.zuyatna.petsave.common.domain.model.animal.details

data class Breed(val primary: String, val secondary: String) {
    val mixed: Boolean
        get() = primary.isNotEmpty() && secondary.isNotEmpty()

    val unknown: Boolean
        get() = primary.isEmpty() && secondary.isEmpty()
}
