package application.rudn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn : Button
        var txt : TextView

        btn = findViewById(R.id.myBtn2)
        txt = findViewById(R.id.myTxt2)

        btn.setOnClickListener{
            txt.setText("Text after")
        }
    }
}