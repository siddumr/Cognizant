package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository manuscriptDepot;

    public void setManuscriptDepot(BookRepository manuscriptDepot) {
    this.manuscriptDepot = manuscriptDepot;
}


    public void retrieveBook() {
        System.out.println("Retrieving book  from the repository.");
        manuscriptDepot.fetchData();
    }
}