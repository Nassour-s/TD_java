package com.example.library.app;

import com.example.library.model.Book;
import com.example.library.model.Member;
import com.example.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        library.addBook(new Book("978-1234567890", "Clean Code", "Robert Martin"));
        library.addBook(new Book("978-0987654321", "le programmeur pragmatique", "Andrew Hunt"));

        library.addMember(new Member("M001", "Nassour Yakhoub", "nassour@example.com"));
        library.addMember(new Member("M002", "Idriss Ahmed", "idriss@example.com"));

        System.out.println("Livres : " + library.getBooks());
        System.out.println("Membres : " + library.getMembers());
        System.out.println("Livres de Robert Martin : " + library.findBooksByAuthor("Robert Martin"));
    }
}