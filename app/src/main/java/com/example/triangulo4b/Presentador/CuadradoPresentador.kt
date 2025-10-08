package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoCuadrado
import com.example.triangulo4b.Modelo.CuadradoModelo

class CuadradoPresentador(private val vista: ContratoCuadrado.vista): ContratoCuadrado.presentador
{
    private val modelo: ContratoCuadrado.modelo= CuadradoModelo()

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


}