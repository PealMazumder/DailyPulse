package com.petros.efthymiou.dailypulse

import kotlinx.coroutines.CoroutineScope


/**
 * Created by Peal Mazumder on 12/2/25.
 */

expect open class BaseViewModel() {
    val scope: CoroutineScope
}