package br.edu.ifpr.patrickszalbot.aula04_app02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        if (intent.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            val sharedMessage = intent.getStringExtra(Intent.EXTRA_TEXT)
            txtMessage.text = sharedMessage
        }
    }
}