package ikergc.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLanzar: Button = findViewById(R.id.btnLanzar)

        btnLanzar.setOnClickListener{
            time()
        }
        rollDice()
    }

    private fun rollDice() {

        val num: Int = throwDice(6)
        val txtResult: TextView = findViewById(R.id.txtResultado)
        txtResult.text = num.toString()


       val drawableResource = when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val imgDice: ImageView = findViewById(R.id.imgDado)
        imgDice.setImageResource(drawableResource)

    }

    private fun throwDice(max: Int): Int {

        return (1..max).random()
    }

    private fun time() {

        object: CountDownTimer(3000, 250) {
            override fun onTick(millisUntilFinished: Long) {
                rollDice()
            }

            override fun onFinish() {

            }
        }.start()
    }
}
