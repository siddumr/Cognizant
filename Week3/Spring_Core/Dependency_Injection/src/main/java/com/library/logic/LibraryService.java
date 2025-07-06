package com.library.logic;

import com.library.storage.BookDepot;

public class LibraryService {
    private BookDepot archiveUnit;

    public void setArchiveUnit(BookDepot archiveUnit) {
        this.archiveUnit = archiveUnit;
    }

    public void initiateRetrieval() {
        System.out.println("Initiating book retrieval through LibraryService...");
        archiveUnit.provideAccess();
    }
}