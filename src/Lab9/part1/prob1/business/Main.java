package Lab9.part1.prob1.business;

import Lab9.part1.prob1.dataaccess.DataAccess;
import Lab9.part1.prob1.dataaccess.DataAccessFacade;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

//	public static void main(String[] args) {
//		System.out.println(allWhoseZipContains3());
//		System.out.println(allHavingAtLeastTwoCopies());
//		System.out.println(allHavingMultipleAuthors());
//	}
//	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
//	public static List<String> allWhoseZipContains3() {
//		//implement
//		return (new DataAccessFacade().readMemberMap().values())
//				.stream()
//				.filter(x -> x.getAddress().getZip().contains("3"))
//				.map(LibraryMember::getMemberId)
//				.collect(Collectors.toList());
//	}
//	//Returns a list of all isbns of books having at least two copies
//	public static List<String> allHavingAtLeastTwoCopies() {
//		//implement
//		return (new DataAccessFacade()).readBooksMap().values()
//				.stream()
//				.filter(x -> x.getCopies().length == 2)
//				.map(Book::getIsbn)
//				.collect(Collectors.toList());
//	}
//
//	//Returns a list of all isbns of  Books that have multiple authors
//	public static List<String> allHavingMultipleAuthors() {
//		//implement
//		return (new DataAccessFacade()).readBooksMap().values()
//				.stream()
//				.filter(book -> book.getAuthors().size() > 1)
//				.map(Book::getIsbn)
//				.collect(Collectors.toList());
//	}
	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement
		return mems.stream().filter(libraryMember -> libraryMember.getAddress().getZip().length() == 3)
				.map(libraryMember -> libraryMember.getMemberId())
				.collect(Collectors.toList());

	}
	//Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		return bs.stream().filter(book -> book.getNumCopies() == 2)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());

	}

	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement
		return (new DataAccessFacade().readBooksMap().values()).stream().filter(book -> book.getAuthors().size() > 1)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());

	}
}
