package com.rapidcore.core.extension

import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment

/**
 * Ekstensi fragment untuk menjalankan fungsi
 * ketika tombol BACK ditekan
 */
@Suppress("unused")
fun Fragment.onBackPress(action: ()-> Unit){
    requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true){
        override fun handleOnBackPressed() {
            action()
        }
    })
}