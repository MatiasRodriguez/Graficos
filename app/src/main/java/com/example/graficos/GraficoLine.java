package com.example.graficos;

import com.jjoe64.graphview.series.DataPointInterface;

public  class GraficoLine implements DataPointInterface {
    private String NombreEvento;
    private int  CantidadPersonas;

    public GraficoLine(){
        NombreEvento = "";
        CantidadPersonas = 0;

    }
    public GraficoLine(String nombreEvento, int cantidadPersonas) {
        NombreEvento = nombreEvento;
        CantidadPersonas = cantidadPersonas;
    }

    public String getNombreEvento() {
        return NombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        NombreEvento = nombreEvento;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        CantidadPersonas = cantidadPersonas;
    }
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }
}
