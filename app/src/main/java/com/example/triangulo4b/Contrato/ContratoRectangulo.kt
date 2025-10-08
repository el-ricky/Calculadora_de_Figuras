package com.example.triangulo4b.Contrato

interface ContratoRectangulo {

    interface modelo
    {
        //Rectangulo
        fun areaRectangulo(l1:Float,l2:Float):Float;
        fun perimetroRectangulo(l1:Float,l2:Float):Float;
        fun validaRectangulo(l1:Float,l2:Float):Boolean;
    }

    interface Vista
    {
        fun showArea(area:Float);
        fun showPerimetro(perimetro:Float);
        fun showError(msg:String);
    }

    interface presentador
    {
        //funciones para el rectangulo
        fun areaRectangulo(l1:Float,l2:Float);
        fun perimetroRectangulo(l1:Float,l2:Float);
    }

}