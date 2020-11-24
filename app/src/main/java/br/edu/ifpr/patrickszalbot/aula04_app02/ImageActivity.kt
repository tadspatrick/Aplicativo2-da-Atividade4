package br.edu.ifpr.patrickszalbot.aula04_app02

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        if (intent.action == Intent.ACTION_SEND && intent.type == "image/*"){
            val imageUri = intent.getParcelableExtra(Intent.EXTRA_STREAM) as Uri?
            imgShare.setImageURI(imageUri)
        }
    }
}