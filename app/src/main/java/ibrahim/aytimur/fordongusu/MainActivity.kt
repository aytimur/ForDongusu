package ibrahim.aytimur.fordongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (degisken in 1 until 3){
            textView.setText("$degisken")
            Toast.makeText(applicationContext,"$degisken", Toast.LENGTH_SHORT).show()
        }
        for (i in 6 downTo 0 step 2){
            textView.setText("$i")
            Toast.makeText(applicationContext,"$i", Toast.LENGTH_SHORT).show()
        }

        var list1 = arrayOf(90,80,70,60,50)
        for (sonuc in list1.indices){
            textView.setText("list1$sonuc" + list1[sonuc])
            Toast.makeText(applicationContext,"list1$sonuc" + list1[sonuc], Toast.LENGTH_SHORT).show()
        }
    }
}
