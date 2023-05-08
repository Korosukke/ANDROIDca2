package com.example.ca2

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Button
import android.widget.TextView

class TouchDemo(
    context: Context,
    attrs: AttributeSet
) : androidx.appcompat.widget.AppCompatTextView(context, attrs) {
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (this.id == R.id.textView2) {
                    this.text = "Manas Yadav"
                } else if (this.id == R.id.textView3) {
                    this.text = "Roll Number: 24"
                }
            }
        }
        return true
    }

}