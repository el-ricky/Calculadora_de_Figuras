package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoCirculo
import kotlin.math.PI

class CirculoModelo: ContratoCirculo.modelo
{
    //Funciones del circulo
    override fun areaCirculo(radio: Float): Float
    {
        val area= PI.toFloat() * (radio * radio)
        return area
    }

    override fun perimetroCirculo(radio: Float): Float
    {
        return 2*PI.toFloat()*radio;
    }

    override fun validaCirculo(radio: Float): Boolean
    {
        return (radio>0)
    }

}