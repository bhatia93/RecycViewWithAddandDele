package com.example.esteplogic_android.recylerviewdemo;


import android.graphics.drawable.Drawable;

public class Movie
{

    private String title, genre, year;
    private int path;
    public Movie()
    {

    }

    public Movie(String title, String genre, String year, int path)
    {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.path = path;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String name)
    {
        this.title = name;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public void setPath(int path)
    {
        this.path = path;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getPath()
    {
        return path;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}