package com.akhenaton.todoappmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.akhenaton.todoappmvvm.ui.TodoAppMVVMTheme
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoAppMVVMTheme {
                
            }
        }
    }
}
