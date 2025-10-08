package com.example.triangulo4b.Contrato

interface ContratoCuadrado
{
    interface modelo
    {
        //Cuadrado
        fun areaCuadrado(l1:Float):Float;
        fun perimetroCuadrado(l1:Float):Float;
        fun validaCuadrado(l1:Float):Boolean;
    }
    interface vista
    {
        fun showArea(area:Float);
        fun showPerimetro(perimetro:Float);
        fun showError(msg:String);

    }
    interface presentador
    {
        //funciones para cuadrado
        fun areaCuadrado(l1:Float);
        fun perimetroCuadrado(l1:Float);
    }
}
