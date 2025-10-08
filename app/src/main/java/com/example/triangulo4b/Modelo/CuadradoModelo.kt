package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoCuadrado

class CuadradoModelo: ContratoCuadrado.modelo
{
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

}