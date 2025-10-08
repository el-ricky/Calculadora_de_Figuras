package com.example.triangulo4b.Contrato

interface ContratoCirculo
{
    interface modelo
    {
        //Circulo
        fun areaCirculo(radio:Float): Float;
        fun perimetroCirculo(radio:Float):Float;
        fun validaCirculo(radio:Float):Boolean;
    }

    interface vista
    {
        fun showArea(area:Float);
        fun showPerimetro(perimetro:Float);
        fun showError(msg:String);
    }

    interface presentador
    {
        //funciones para circulo
        fun areaCirculo(radio:Float);
        fun perimetroCirculo(radio:Float);

    }

}
