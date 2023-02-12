package com.recycler_view_retrofit.mvpretrofit.Entidades;

import com.google.gson.annotations.SerializedName;

public class Simpson {
    @SerializedName("quote")
    private String quote;

    @SerializedName("character")
    private String character;

    @SerializedName("image")
    private String image;

    @SerializedName("characterDirection")
    private String characterDirection;

    public String getQuote() {
        return quote;
    }

    public String getCharacter() {
        return character;
    }

    public String getImage() {
        return image;
    }




    @Override
    public String toString() {
        return "Simpson {\n" +
                "quote='" + quote + '\'' +
                ",\ncharacter='" + character + '\'' +
                ",\nimage='" + image + '\'' +
                ",\ncharacterDirection='" + characterDirection + '\'' +
                "\n}";
    }
}
