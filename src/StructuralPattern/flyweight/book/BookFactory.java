package StructuralPattern.flyweight.book;

public class BookFactory implements Factory{



    @Override
    public Character createCharacter(char c, boolean upperCase) {
        return null;
    }

    @Override
    public Line createLine(int numberOfCharacters) {
        return null;
    }

    @Override
    public Page createPage(int no, int numberOfLines) {
        return null;
    }

    @Override
    public Book createBook(String name, int numberOfPages) {
        return null;
    }
}
