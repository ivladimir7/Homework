package com.telran.genre;

public class Genre {
    private String Book;
    private String Story;

    public Genre(String Book, String Story) {
        this.Book = Book;
        this.Story = Story;
    }

    public void PlaceOfEvents(String Book, String Story) {
        System.out.println(Book + " " +  Story);
    }
    public String getBook() {
        return Book;
    }
    public String getStory() {
        return Story;
}
}