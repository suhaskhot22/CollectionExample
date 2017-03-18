package com.demo.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class CollectionList {
public static void main(String[] args) {
	
	/*String[] str=new String[10];
	str[0]="sss";
	str[1]="aaa";
	str[2]="bbb";
	str[3]="ccc";
	str[4]="ddd";
	for(int i=0;i<str.length;i++)//length is the property of array  
		System.out.println(str[i]);*/
	
	List<String> lone=new ArrayList();
	lone.add("Suhas");
	lone.add("Sunil");
	lone.add("Jeevan");
	lone.add("Amar");
	lone.add("Pashu");
	
	//System.out.println(lone);
	
	List<String> linkedlist=new LinkedList<String>();
	linkedlist.addAll(lone);
	
	Vector<String> vector = new Vector<String>();
    vector.add("JAVA");
    vector.add("JSP");
    vector.add("SERVLET");
    vector.add("EJB");
    vector.add("PHP");
    
    //System.out.println(vector);
    
    
    Stack<String> stack=new Stack<String>();
    stack.push("xyz");
    stack.push("pqr");
    stack.push("abc");
    stack.push("ssk");
    
    
    MyCollection.getCollectionUsingIterator(lone);
    MyCollection.getCollectionUsingListIterator(linkedlist);
    MyCollection.getCollectionUsingEnumeration(vector);
    MyCollection.getCollectionUsingEnumeration(stack);
	
}
}
class MyCollection
{

	
	public static void getCollectionUsingIterator(List<String> lone) {
		// TODO Auto-generated method stub
		Iterator<String> itr=lone.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("==================");
		/*for(String obj:lone)
		{
			System.out.println(obj);
		}*/
	}

	public static void getCollectionUsingListIterator(List<String> linkedlist) {
		// TODO Auto-generated method stub
		ListIterator<String> litr=linkedlist.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("==================");
	}

	public static void getCollectionUsingEnumeration(Vector<String> vector) {
		// TODO Auto-generated method stub
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("==================");
	}
	
	public static void getCollectionUsingEnumeration(Stack<String> stack) {
		// TODO Auto-generated method stub
		Enumeration<String> en=stack.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("==================");
	}
}