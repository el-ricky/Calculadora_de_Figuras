package com.example.triangulo4b.Contrato

interface ContratoTriangulo
{
    interface Modelo
    {
        //Triangulo
        fun area(l1:Float,l2:Float,l3:Float):Float
        fun perimetro(l1:Float,l2:Float,l3:Float):Float
        fun tipo(l1:Float,l2:Float,l3:Float): String
        fun valida(l1:Float,l2:Float,l3:Float): Boolean

        //Rectangulo
        fun areaRectangulo(l1:Float,l2:Float):Float;
        fun perimetroRectangulo(l1:Float,l2:Float):Float;
        fun validaRectangulo(l1:Float,l2:Float):Boolean;

        //Cuadrado
        fun areaCuadrado(l1:Float):Float;
        fun perimetroCuadrado(l1:Float):Float;
        fun validaCuadrado(l1:Float):Boolean;

        //Circulo
        fun areaCirculo(radio:Float): Float;
        fun perimetroCirculo(radio:Float):Float;
        fun validaCirculo(radio:Float):Boolean;

    }
    interface Vista
    {
        //se reutiliza las funciones de area, perimetro y error para todas las figuras.
        fun showArea(area:Float);
        fun showPerimetro(perimetro:Float);
        fun showTipo(tipo:String);
        fun showError(msg:String);
    }

    interface Presentador
    {
        fun area(l1:Float,l2:Float,l3:Float)
        fun perimetro(l1:Float,l2:Float,l3:Float)
        fun tipo(l1:Float,l2:Float,l3:Float)

        //funciones para el rectangulo
        fun areaRectangulo(l1:Float,l2:Float);
        fun perimetroRectangulo(l1:Float,l2:Float);

        //funciones para cuadrado
        fun areaCuadrado(l1:Float);
        fun perimetroCuadrado(l1:Float);

        //funciones para circulo
        fun areaCirculo(radio:Float);
        fun perimetroCirculo(radio:Float);

    }
}