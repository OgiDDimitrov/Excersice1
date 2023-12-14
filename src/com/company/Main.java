package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author1 = new Author("DIMITROV");
        Presentation p1 = new Presentation (author1, "Theme1", 10);
        p1.submit();
        System.out.println(p1);
        System.out.println();

        Presentation p2 = (Presentation) p1.clone();
        p2.getAuthor().setName("IVANOVA");
        p2.submit();
        System.out.println(p2);
        System.out.println();

        Presentation p3 = (Presentation) p1.clone();
        p3.getAuthor().setName("ANGELOV");
        p3.submit();
        System.out.println(p3);
        System.out.println();

        Presentation p4 = (Presentation) p1.clone();
        p4.getAuthor().setName("GENCHEV");
        p4.submit();
        System.out.println(p4);
        System.out.println();
    }
}
