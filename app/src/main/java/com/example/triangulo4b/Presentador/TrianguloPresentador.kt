package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoTriangulo
import com.example.triangulo4b.Modelo.TrianguloModelo

class TrianguloPresentador(private val vista: ContratoTriangulo.Vista): ContratoTriangulo.Presentador
{
    //funciones para el triangulo
    private val modelo: ContratoTriangulo.Modelo= TrianguloModelo()

    //funciones del triangulo
    override fun area(l1: Float, l2: Float, l3: Float)
    {
        if (modelo.valida(l1,l2,l3))
        {
            val a=modelo.area(l1,l2,l3);
            vista.showArea(a);
        }
        else
        {
            vista.showError("Datos no validos")
        }

    }
    override fun perimetro(l1: Float, l2: Float, l3: Float)
    {
        if (modelo.valida(l1,l2,l3))
        {
            val p=modelo.perimetro(l1,l2,l3);
            vista.showArea(p);
        }
        else
        {
            vista.showError("Datos no validos")
        }
    }
    override fun tipo(l1: Float, l2: Float, l3: Float)
    {
        if (modelo.valida(l1,l2,l3))
        {
            val t=modelo.tipo(l1,l2,l3);
            vista.showTipo(t);
        }

        else
        {
            vista.showError("Datos no validos");
        }

    }

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

    //funciones del cuadrado
    override fun areaCuadrado(l1: Float)
    {
        if (modelo.validaCuadrado(l1))
        {
            val a= modelo.areaCuadrado(l1);
            vista.showArea(a);
        }
        else
        {
            vista.showError("Ingresa valores validos");
        }
    }
    override fun perimetroCuadrado(l1: Float)
    {
        if(modelo.validaCuadrado(l1))
        {
            val p= modelo.perimetroCuadrado(l1);
            vista.showPerimetro(p);
        }
        else
        {
            vista.showError("Ingresa valores validos");
        }
    }

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