package com.example.a123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var licznik = 1;
        findViewById<Button>(R.id.lewy).setOnClickListener {
            if (licznik == 1)
            licznik = 4;
            else
                licznik = 1;
            if(licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies1);
            if(licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.piess);
            if(licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable._6540394_36540427);
            if(licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.d37xo712edjjpmgi3hm3w51m9zb5e3pa);

        }
findViewById<Button>(R.id.prawy).setOnClickListener {
    if(licznik == 4)
        licznik = 1;
    else
        licznik += 1;
    if(licznik == 1)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pies1);
    if(licznik == 2)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.piess);
    if(licznik == 3)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable._6540394_36540427);
    if(licznik == 4)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.d37xo712edjjpmgi3hm3w51m9zb5e3pa);


}
        findViewById<Button>(R.id.rotacjaprawa).setOnClickListener {
            var rotacja = findViewById<EditText>(R.id.rotacje).text;
            findViewById<ImageView>(R.id.imageView).rotation = rotacje.toString().toFloat();
        }
        findViewById<Button>(R.id.rotacjalewa).setOnClickListener {
            var rotacja = findViewById<EditText>(R.id.rotacje).text;
            findViewById<ImageView>(R.id.imageView).rotation = rotacje.toString().toFloat();
        }
        findViewById<Button>(R.id.skalab).setOnClickListener {
            var skala = findViewById<EditText>(R.id.skala).text;
            findViewById<ImageView>(R.id.imageView).scaleX = skala.toString().toFloat();
            findViewById<ImageView>(R.id.imageView).scaleY = skala.toString().toFloat();
        }
        findViewById<Button>(R.id.widok).setOnClickListener{
            var widok = findViewById<EditText>(R.id.widok).text;
            findViewById<ImageView>(R.id.imageView).
    }
    }
}