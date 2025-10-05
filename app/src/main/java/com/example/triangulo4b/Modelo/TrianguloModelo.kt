package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoTriangulo
import kotlin.math.PI
import kotlin.math.sqrt

class TrianguloModelo: ContratoTriangulo.Modelo
{

    //funciones del triangulo
    override fun area(l1: Float, l2: Float, l3: Float): Float
    {
        val s=(l1+l2+l3)/2;
        return sqrt(s*(s-l1)*(s-l1)*(s-l3));
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float): Float
    {
        return l1+l2+l3;
    }

    override fun tipo(l1: Float, l2: Float, l3: Float): String
    {
        var tipo = ""
        if (l1 == l2 && l2 == l3)
            tipo = "El triangulo es Equilatero"
        else if (l1 != l2 && l2 != l3 && l3 != l1)
            tipo = "El triangulo es escaleno"
        else
            tipo = "El triangulo es isoceles"

        return tipo;
    }

    override fun valida(l1: Float, l2: Float, l3: Float): Boolean
    {
        if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1 && l1>0 && l2>0 && l3>0)
        {
            return true
        }
        else
        {
            return false
        }
    }

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

    //Funciones del cuadrado
    override fun areaCuadrado(l1: Float): Float
    {
        return l1*l1;
    }

    override fun perimetroCuadrado(l1: Float): Float
    {
        return 4*l1;
    }

    override fun validaCuadrado(l1: Float): Boolean
    {
        return (l1>0)
    }

    //Funciones del circulo
    override fun areaCirculo(radio: Float): Float
    {
        val area= PI.toFloat() * radio * radio
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