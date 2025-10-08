package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Contrato.ContratoTriangulo
import com.example.triangulo4b.Modelo.RectanguloModelo
import com.example.triangulo4b.Modelo.TrianguloModelo

class RectanguloPresentador(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.presentador
{
    private val modelo: ContratoRectangulo.modelo= RectanguloModelo()


    //funciones del rectangulo
    override fun areaRectangulo(l1: Float, l2: Float)
    {
        if(modelo.validaRectangulo(l1,l2))
        {
            val a=modelo.areaRectangulo(l1,l2);
            vista.showArea(a);
        }
        else
        {
            vista.showError("Los valores no corresponden a una rectangulo");
        }
    }
    override fun perimetroRectangulo(l1: Float, l2: Float)
    {
        if(modelo.validaRectangulo(l1,l2))
        {
            val p=modelo.perimetroRectangulo(l1,l2)
            vista.showPerimetro(p)
        }
        else
        {
            vista.showError("Los valores no corresponden a una rectangulo")
        }
    }

}