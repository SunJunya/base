package com.part1.composingobjects;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ComposingObject implements Set<String>{
	public static void main(String[] args) {
		Son f = new Son();
		f.runn(3);
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public boolean contains(Object o) {
		
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;
	}

	@Override
	public boolean add(String e) {
		
		return false;
	}

	@Override
	public boolean remove(Object o) {
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public void clear() {
	}
}

class Father{
	void runn() {
		System.out.println(123);
	}
}

interface s{
	public void say();
}

class Son extends Father  implements s{
	public void runn(int i) {
		System.out.println("456");
	}

	@Override
	public void say() {
	}
}
