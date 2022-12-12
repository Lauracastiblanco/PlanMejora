package loveCalculator;

import java.util.Random;

public class calculadora {
    private String nombre, crushNombre;
    private double porcentaje, numaleatorio;
    int num;
    public calculadora(){}
    public calculadora(String nombre, String crushNombre, double porcentaje, double numaleatorio) {
        this.nombre = nombre;
        this.crushNombre = crushNombre;
        this.porcentaje = porcentaje;
        this.numaleatorio = numaleatorio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCrushNombre() {
        return crushNombre;
    }
    public void setCrushNombre(String crushNombre) {
        this.crushNombre = crushNombre;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public double getNumaleatorio() {
        return numaleatorio;
    }
    public void setNumaleatorio(double numaleatorio) {
        this.numaleatorio = numaleatorio;
    }
    public void loveCalculator(){
        Random numaleatorio = new Random();
        num = Math.abs(numaleatorio.nextInt(100)*1);
        //System.out.println("el numero aleatorio es: " + num);
    }
    public void mostrarDatos(){
        System.out.println(getNombre()+ " y "+ getCrushNombre() + " = " + num + "% de compatibilidad.");
    }
}
