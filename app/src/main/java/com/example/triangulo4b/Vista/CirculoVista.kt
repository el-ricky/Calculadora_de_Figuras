package com.example.triangulo4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Presentador.CirculoPresentador
import com.example.triangulo4b.R

class CirculoVista : AppCompatActivity(), ContratoCirculo.vista {

    private lateinit var txvResultado: TextView;
    private lateinit var presentador: ContratoCirculo.presentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_circulo_vista)

        //inicialimaos los componentes
        val txtl1=findViewById<EditText>(R.id.edtl1);
        val btnArea=findViewById<Button>(R.id.btnArea);
        val btnPerimetro= findViewById<Button>(R.id.btnPerimetro);

        txvResultado=findViewById<TextView>(R.id.txvResultado);
        //inicializamos al presentador
        presentador= CirculoPresentador(this)

        //declaramos el boton de regresar
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val l1 = txtl1.text.toString().toFloat();
            presentador.perimetroCirculo(l1);
        }

        btnArea.setOnClickListener {

            val l1 = txtl1.text.toString().toFloat();
            presentador.areaCirculo(l1);
        }

        // Configurar el botón de regreso
        btnRegresar.setOnClickListener {
            finish()   // Cierra la calculadora y vuelve al MenuFiguras
        }

    }

    override fun showArea(area: Float) {
        txvResultado.text="El area es: ${area}"
    }

    override fun showPerimetro(perimetro: Float) {
        txvResultado.text="El perimetro es: ${perimetro}"
    }

    override fun showError(msg: String) {
        txvResultado.text=msg;
    }
}