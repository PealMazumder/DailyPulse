package com.petros.efthymiou.dailypulse

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.cancel


/**
 * Created by Peal Mazumder on 12/2/25.
 */

actual open class BaseViewModel {
    actual val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    fun clear() {
        scope.cancel()
    }
}