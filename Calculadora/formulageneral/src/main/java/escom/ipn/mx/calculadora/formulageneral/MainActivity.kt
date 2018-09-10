package escom.ipn.mx.calculadora.formulageneral

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /*
    fun calcularValores(view: View?){
        val a: Int = R.id.valorA
        val b: Int = R.id.valorB
        val c: Int = R.id.valorC

        if((a != null && b != null && c != null)){
            val labelResultado = findViewById(R.id.resultado) as TextView
            labelResultado.setText("Hay un resultado :)")
        }
        else{
            val labelResultado = findViewById(R.id.resultado) as TextView
            labelResultado.setText("Valores nulos o no numericos")
        }
    }
    */


}
