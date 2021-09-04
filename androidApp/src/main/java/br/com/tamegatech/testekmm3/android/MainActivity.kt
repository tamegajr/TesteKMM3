package br.com.tamegatech.testekmm3.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.tamegatech.testekmm3.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val btnfactorial: Button = findViewById(R.id.button)
        val txtNumber: EditText = findViewById(R.id.editTextNumber)
        val lblResult: TextView = findViewById(R.id.lblResult)

        btnfactorial.setOnClickListener{
            val number: Int
            number = Integer.parseInt(txtNumber.text.toString())
            val numberFactorial: Double
            numberFactorial = factorial(number)
            lblResult.text = numberFactorial.toString()
        }
    }
    fun factorial(n:Int):Double{
        var f: Double
         f = 1.0
        if (n <=1){

        }else{
            for (i in n downTo 1 step 1){
                f*=i
            }
        }
        return f
    }
}
