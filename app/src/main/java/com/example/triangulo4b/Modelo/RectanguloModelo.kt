package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoRectangulo

class RectanguloModelo: ContratoRectangulo.modelo
{
    //funciones del rectangulo
    override fun areaRectangulo(l1: Float, l2: Float): Float
    {
        return l1*l2;
    }

    override fun perimetroRectangulo(l1: Float, l2: Float): Float
    {
        return 2*(l1+l2);
    }

    override fun validaRectangulo(l1: Float, l2: Float): Boolean
    {

        if (l1!=l2 && l1>0 && l2>0)
        {
            return true
        }
        else
        {
            return false
        }

    }

}