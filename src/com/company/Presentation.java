package com.company;

public class Presentation extends Document implements Cloneable {
    private  Author author;
    private String theme;
    private int numSlides;

    public Presentation() {
        this.author = new Author();
        this.theme = "";
        this.numSlides = 0;
    }

    public Presentation(Author author, String theme, int numSlides) {
        this.author = author;
        this.theme = theme;
        this.numSlides = numSlides;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "author=" + author +
                ", theme='" + theme + '\'' +
                ", numSlides=" + numSlides +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Presentation pClone = (Presentation) super.clone();
        return pClone;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumSlides() {
        return numSlides;
    }

    public void setNumSlides(int numSlides) {
        this.numSlides = numSlides;
    }

    @Override
    public void submit() {
        System.out.println("Презентацията на " + author.toString() + " е предадена!");
    }
}
