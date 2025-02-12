package com.petros.efthymiou.dailypulse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope


/**
 * Created by Peal Mazumder on 12/2/25.
 */

actual open class BaseViewModel : ViewModel() {
    actual val scope = viewModelScope
}