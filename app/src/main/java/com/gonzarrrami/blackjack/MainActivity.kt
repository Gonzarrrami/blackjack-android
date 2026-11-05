package com.gonzarrrami.blackjack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gonzarrrami.blackjack.ui.theme.BlackjackTheme
import com.gonzarrrami.blackjack.ui.theme.BoxTapete


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BlackjackTheme {
                BoxTapete()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    BlackjackTheme {
        BoxTapete()
    }
}
