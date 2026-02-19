package com.example.numoneapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class OrderOptionsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_options)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val toBarista = findViewById<ImageView>(R.id.toBarista)
        toBarista.setOnClickListener {

            val intentToBarista = Intent(this, MyOrderActivity::class.java)
            startActivity(intentToBarista)
        }


        val shop = findViewById<ImageView>(R.id.imageView9)
        shop.setOnClickListener {

            val intentShop = Intent(this, OrderCurrentActivity::class.java)
            startActivity(intentShop)
        }
        var isSelectedDwa = false;
        var isSelected = false;
        var isSelectedCup = false;
        var isSelectedLongCup = false;
        var isSelectedSmall = false;
        var isSelectedMid = false;
        var isSelectedBig = false;


        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {

            val intentBack = Intent(this, MenuActivity::class.java)
            startActivity(intentBack)
        }


        val buttonOdin = findViewById<ImageView>(R.id.odin)


        buttonOdin.setOnClickListener {

            isSelected = !isSelected

            if(isSelectedDwa == false) {
                if(isSelected) {
                    buttonOdin.setColorFilter(getColor(R.color.black))
                } else {
                    buttonOdin.setColorFilter(getColor(R.color.gray_A1))
                }
            }
        }


        val buttonDwa = findViewById<ImageView>(R.id.dwa)



        buttonDwa.setOnClickListener {

            isSelectedDwa = !isSelectedDwa

            if(isSelected == false){

                if(isSelectedDwa) {
                    buttonDwa.setColorFilter(getColor(R.color.black))
                } else {
                    buttonDwa.setColorFilter(getColor(R.color.gray_A1))
                }
            }
        }





        val cup = findViewById<ImageView>(R.id.cup)

        cup.setOnClickListener {

            isSelectedCup = !isSelectedCup

            if(isSelectedLongCup == false){

                if(isSelectedCup) {
                    cup.setColorFilter(getColor(R.color.black))
                } else {
                    cup.setColorFilter(getColor(R.color.gray_A1))
                }
            }
        }


        val longcup = findViewById<ImageView>(R.id.longcup)

        longcup.setOnClickListener {

            isSelectedLongCup = !isSelectedLongCup

            if(isSelectedCup == false){

                if(isSelectedLongCup) {
                    longcup.setColorFilter(getColor(R.color.black))
                } else {
                    longcup.setColorFilter(getColor(R.color.gray_A1))
                }
            }
        }



        val big = findViewById<ImageView>(R.id.bigcoffee)
        val ml450 = findViewById<TextView>(R.id.ml450)

      big.setOnClickListener {

          isSelectedBig = !isSelectedBig

          if(!isSelectedMid){
              big.setColorFilter(getColor(R.color.black))
              ml450.setTextColor(getColor(R.color.black))
          } else {
              big.setColorFilter(getColor(R.color.gray))
              ml450.setTextColor(getColor(R.color.gray))

          }

      }

        val mid = findViewById<ImageView>(R.id.midcoffee)
        val ml350 = findViewById<TextView>(R.id.ml350)

        mid.setOnClickListener {

            isSelectedMid = !isSelectedMid

            if(!isSelectedBig){
                mid.setColorFilter(getColor(R.color.black))
                ml350.setTextColor(getColor(R.color.black))
            } else {
                mid.setColorFilter(getColor(R.color.gray))
                ml350.setTextColor(getColor(R.color.gray))

            }

        }










    }
}