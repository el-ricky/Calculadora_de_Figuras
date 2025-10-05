package com.example.triangulo4b.Vista

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoTriangulo
import com.example.triangulo4b.Presentador.TrianguloPresentador
import com.example.triangulo4b.R

class MainActivity : AppCompatActivity(), ContratoTriangulo.Vista
{
    //declaramos a txt para poder usuarlo
    private lateinit var txvRes: TextView;

    //declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador: ContratoTriangulo.Presentador

    // añadimos referencias para los nuevos elementos del XML
    private lateinit var spFigura: Spinner
    private lateinit var containerTriangulo: View
    private lateinit var containerRectangulo: View
    private lateinit var containerCuadrado:View
    private lateinit var containerCirculo: View

    private lateinit var btnTipo: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //inicialimaos los componentes
        val txtl1=findViewById<EditText>(R.id.edtl1);
        val txtl2=findViewById<EditText>(R.id.edtl2);
        val txtl3=findViewById<EditText>(R.id.edtl3);

        val btnArea=findViewById<Button>(R.id.btnArea);
        val btnPerimetro= findViewById<Button>(R.id.btnPerimetro);

        val txtBase = findViewById<EditText>(R.id.edtBase)
        val txtAltura = findViewById<EditText>(R.id.edtAltura)

        val txtLado=findViewById<EditText>(R.id.edtlado)
        val txtRadio= findViewById<EditText>(R.id.edtradio)


        btnTipo=findViewById<Button>(R.id.btnTipo);
        txvRes=findViewById<TextView>(R.id.txvResultado);

        // inicializamos los nuevos contenedores y spinner
        spFigura = findViewById<Spinner>(R.id.spFigura)
        containerTriangulo = findViewById<LinearLayout>(R.id.containerTriangulo)
        containerRectangulo = findViewById<LinearLayout>(R.id.containerRectangulo)
        containerCuadrado= findViewById<LinearLayout>(R.id.containerCuadrado)
        containerCirculo=findViewById<LinearLayout>(R.id.containerCirculo)



        //inicializamos al presentador
        presentador= TrianguloPresentador(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- NUEVO: comportamiento del Spinner ---
        spFigura.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                if (position == 0)
                {
                    // Triángulo seleccionado
                    containerTriangulo.visibility = View.VISIBLE
                    containerRectangulo.visibility = View.GONE
                    containerCuadrado.visibility = View.GONE
                    containerCirculo.visibility = View.GONE
                    btnTipo.visibility = View.VISIBLE
                    txvRes.text = "" // limpia el resultado
                }
                else if(position == 1)
                {
                    // Rectángulo seleccionado
                    containerTriangulo.visibility = View.GONE
                    containerRectangulo.visibility = View.VISIBLE
                    containerCuadrado.visibility = View.GONE
                    containerCirculo.visibility = View.GONE

                    btnTipo.visibility = View.GONE
                    txvRes.text = "" //
                }
                else if (position == 2)
                {
                    // Cuadrado seleccionado
                    containerTriangulo.visibility = View.GONE
                    containerRectangulo.visibility = View.GONE
                    containerCuadrado.visibility = View.VISIBLE
                    containerCirculo.visibility = View.GONE

                    btnTipo.visibility = View.GONE
                    txvRes.text = ""
                }
                else
                {
                    // Circulo seleccionado
                    containerTriangulo.visibility = View.GONE
                    containerRectangulo.visibility = View.GONE
                    containerCuadrado.visibility = View.GONE
                    containerCirculo.visibility = View.VISIBLE
                    btnTipo.visibility = View.GONE
                    txvRes.text = ""
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }



        btnPerimetro.setOnClickListener{
            if (spFigura.selectedItemPosition==0)
            {
                val l1 = txtl1.text.toString().toFloat();
                val l2 = txtl2.text.toString().toFloat();
                val l3 = txtl3.text.toString().toFloat();
                presentador.perimetro(l1, l2, l3);
            }
            else if (spFigura.selectedItemPosition==1)
            {

                val base = txtBase.text.toString().toFloat()
                val altura = txtAltura.text.toString().toFloat()
                presentador.perimetroRectangulo(base, altura)

            }
            else if (spFigura.selectedItemPosition==2)
            {
                val lado = txtLado.text.toString().toFloat()
                presentador.perimetroCuadrado(lado)
            }

            else
            {
                val radio = txtRadio.text.toString().toFloat()
                presentador.perimetroCirculo(radio)

            }
        }

        btnArea.setOnClickListener {
            if (spFigura.selectedItemPosition==0)
            {
                // Triángulo
                val l1 = txtl1.text.toString().toFloat();
                val l2 = txtl2.text.toString().toFloat();
                val l3 = txtl3.text.toString().toFloat();
                presentador.area(l1, l2, l3);
            }

            else if (spFigura.selectedItemPosition==1)
            {
                // Rectángulo
                val base = txtBase.text.toString().toFloat()
                val altura = txtAltura.text.toString().toFloat()
                presentador.areaRectangulo(base, altura)
            }
            else if (spFigura.selectedItemPosition==2)
            {
                val lado = txtLado.text.toString().toFloat()
                presentador.areaCuadrado(lado)
            }
            else
            {
                val radio = txtRadio.text.toString().toFloat()
                presentador.areaCirculo(radio)
            }

        }
        btnTipo.setOnClickListener {
            val l1 = txtl1.text.toString().toFloat()
            val l2 = txtl2.text.toString().toFloat()
            val l3 = txtl3.text.toString().toFloat()
            presentador.tipo(l1,l2,l3);
        }
    }

    override fun showArea(area: Float)
    {
        txvRes.text="El area es: ${area}"
    }

    override fun showPerimetro(perimetro: Float)
    {
        txvRes.text="El perimetro es: ${perimetro}"
    }

    override fun showTipo(tipo: String)
    {
        txvRes.text="Tipo: ${tipo}"
    }

    override fun showError(msg: String)
    {
        txvRes.text=msg;
    }
}