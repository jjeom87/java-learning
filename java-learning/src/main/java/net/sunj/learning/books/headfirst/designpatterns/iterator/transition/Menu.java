package net.sunj.learning.books.headfirst.designpatterns.iterator.transition;

import java.util.Iterator;

public interface Menu {
	public Iterator<?> createIterator();
}
