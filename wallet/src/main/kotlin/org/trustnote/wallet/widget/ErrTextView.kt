package org.trustnote.wallet.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import org.trustnote.wallet.TApp

class ErrTextView constructor(context: Context, attrs: AttributeSet? = null) : TextView(context, attrs) {

    init {
        setCompoundDrawables(TApp.smallIconError, null, null, null)
    }

}