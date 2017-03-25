package org.vgu.cs2014.translateprogram;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CustomList implements List<PerformedTranslation>{

	private static List<PerformedTranslation> liste = null;
	
	CustomList (List<PerformedTranslation> newList) {
		liste = newList;
	}

	@Override
	public boolean add(PerformedTranslation e) {
		
		System.out.println("LOG: now performing the addition of an object.");
		
		long start = System.currentTimeMillis();
		boolean s = liste.add(e);
		
		long stop = System.currentTimeMillis();
		long running = stop - start;
		
		System.out.println("Required execution time: " + running + " ms");
		return s;
	}
	
	public List<PerformedTranslation> getList() {
		return liste;
	}

	@Override
	public void add(int index, PerformedTranslation element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends PerformedTranslation> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends PerformedTranslation> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PerformedTranslation get(int index) {
		// TODO Auto-generated method stub
		return liste.get(index);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<PerformedTranslation> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<PerformedTranslation> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<PerformedTranslation> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PerformedTranslation remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PerformedTranslation set(int index, PerformedTranslation element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PerformedTranslation> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
