package com.recycler_view_retrofit.Rview;

public class PersonajeVo {
    private String nombre;
    private String info;
    private int foto;


    public PersonajeVo(String nombre, String info, int foto) {
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }



    public String getInfo() {
        return info;
    }



    public int getFoto() {
        return foto;
    }


}
