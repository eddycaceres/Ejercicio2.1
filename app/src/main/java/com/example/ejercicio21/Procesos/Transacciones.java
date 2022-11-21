package com.example.ejercicio21.Procesos;

public class Transacciones {
    //nombre de la base de datos
    public static final String NameDataBase = "BD1";
    //creacion de tablas de la base de datos

    public static final String tablaVideo = "Video";
    //escoger los campos
    public static final String id ="id";
    public static final String video="video";

//sentencias sql para crear tablas

    public static final String CreateTableVideo = "CREATE TABLE video " +
            "( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "video BLOB)";


    //hacer comando para eliminar la tabla
    public static final String DropTableVideo ="DROP TABLE IF EXISTS video";
}

