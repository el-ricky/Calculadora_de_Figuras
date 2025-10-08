package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Contrato.ContratoCuadrado
import com.example.triangulo4b.Contrato.ContratoTriangulo
import com.example.triangulo4b.Modelo.CirculoModelo
import com.example.triangulo4b.Modelo.CuadradoModelo
import com.example.triangulo4b.Modelo.TrianguloModelo

class CirculoPresentador (private val vista: ContratoCirculo.vista): ContratoCirculo.presentador
{
    private val modelo: ContratoCirculo.modelo = CirculoModelo()


    //funciones circulo
    override fun areaCirculo(radio: Float)
    {
        if(modelo.validaCirculo(radio))
        {
            val a=modelo.areaCirculo(radio);
            vista.showArea(a)
        }
        else
        {
            vista.showError("Radio invalido")
        }
    }

    override fun perimetroCirculo(radio: Float)
    {
        if(modelo.validaCirculo(radio))
        {
            val p=modelo.perimetroCirculo(radio);
            vista.showPerimetro(p);
        }
        else
        {
            vista.showError("Radio invalido")
        }

    }

}