package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka Raczyńskich");
        Book book1 = new Book("Władca Pierścieni", "Tolkien", LocalDate.of(1980, 01, 01));
        Book book2 = new Book ("W pustyni i w puszczy", "Sienkiewicz", LocalDate.of(1840,04,03));
        Book book3 =new Book ("Lalka", "Prus", LocalDate.of(1865,02,14));

        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("biblioteka narodowa");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library clonedLibrary2 = null;
        try {
            clonedLibrary2 = library.deepCopy();
            clonedLibrary2.setName("biblioteka poznanska");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book3);

        //Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, clonedLibrary2.getBooks().size());


    }
}
