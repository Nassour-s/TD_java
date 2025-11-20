package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LibraryService {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public List<Member> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                   .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                   .toList();
    }
}