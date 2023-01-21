package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;


public class CollectionConcept {
	public static void main(String[] args) {

		//		ArrayList<Object> list =new ArrayList<>();
		//		list.add("Hi");
		//		list.add("HEllo");
		//		list.add(10);
		//		list.add(20);
		//		list.add(null);
		//		System.out.println(list);
		//
		//		ArrayList<Integer> list1= new ArrayList<>();
		//		list1.add(30);
		//		list1.add(20);
		//		list1.add(45);
		//		list1.add(10);
		//		list1.add(100);
		//		Collections.sort(list1);//sort an elements in assending order
		//		System.out.println(list1);
		//		list.addAll(list1);//add all the elements of list1 to list 
		//
		//		if(list.contains("Hi"))//check weather element present or not
		//		{
		//			System.out.println("is present");
		//		}
		//		else 
		//		{
		//			System.out.println("is not  present");
		//		}
		//		System.out.println(list.indexOf(100));//fetch the index of element 100
		//		System.out.println(list.get(4));//fetch the element present in index 4
		//		System.out.println(list.remove(3));//remove the element present in index 5
		//
		//		for( Object obj:list)//fetch the element one by one 
		//		{
		//			System.out.println(obj);
		//		}
		//
		//
		//		Stack<Object> s= new Stack<>();
		//		s.push(20);
		//		s.push(10);
		//		System.out.println(s.pop());
		//		System.out.println(s.pop());
		//
		//		LinkedList<Object> list2 = new LinkedList<>();
		//		list2.add("Hi");
		//		list2.add("HEllo");
		//		list2.add(10);
		//		list2.add(20);
		//		list2.add(null);
		//		System.out.println(list2);
		//
		//		LinkedList<Object> list3 = new LinkedList<>();
		//
		//		list3.add(30);
		//		list3.add(20);
		//		list3.add(45);
		//		list3.add(10);
		//		list3.add(100);
		//
		//		//Collections.sort(list3);//sort an elements in assending order
		//		System.out.println(list3);
		//		list.addAll(list2);//add all the elements of list1 to list 
		//
		//		if(list2.contains("Hi"))//check weather element present or not
		//		{
		//			System.out.println("is present");
		//		}
		//		else 
		//		{
		//			System.out.println("is not  present");
		//		}
		//		System.out.println(list.indexOf(100));//fetch the index of element 100
		//		System.out.println(list.get(4));//fetch the element present in index 4
		//		System.out.println(list.remove(3));//remove the element present in index 5
		//
		//		for( Object obj:list)//fetch the element one by one 
		//		{
		//			System.out.println(obj);
		//		}
		//
		//
		//		PriorityQueue<Integer> que = new PriorityQueue<>();
		//		que.add(50);
		//		que.add(10);
		//		que.add(40);
		//		que.add(60);
		//		System.out.println(que);
		//		System.out.println(que.peek());
		//		System.out.println(que);
		//		System.out.println(que.poll());
		//		System.out.println(que);
		//
		//
		//		HashSet<Object> hash= new HashSet<>();
		//		hash.add("Hi");
		//		hash.add(10);
		//		hash.add(null);
		//		hash.add("Guru");
		//		hash.add(null);
		//		System.out.println(hash);
		//		System.out.println(hash.isEmpty());
		//		System.out.println(hash.remove(10));
		//		System.out.println(hash.contains("Hi"));
		//		System.out.println(hash.size());
		//		
		//		for(Object hash1:hash)//fetching the element through for-each loop 
		//		{
		//			System.out.println(hash1);
		//		}
		//		Iterator<Object> it = hash.iterator();//fetching element through iterator
		//		while(it.hasNext())
		//		{
		//			System.out.println(it.next());
		//		}
		//		
		//		ArrayList<Object> list5= new ArrayList<>(hash);//adding elements of set to list
		//		System.out.println(list5);
		//		

		//		
		//		LinkedHashSet<Object> 
	//	linkedhash= new LinkedHashSet<>();
		//		linkedhash.add("hi");
		//		linkedhash.add("hi");
		//		linkedhash.add(10);
		//		linkedhash.add(null);
		//		linkedhash.add("hi");
		//		linkedhash.add(null);
		//		
		//		System.out.println(linkedhash);
		//		System.out.println(linkedhash.isEmpty());
		//		System.out.println(linkedhash.remove(10));
		//		System.out.println(linkedhash.contains("hi"));
		//		System.out.println(linkedhash.size());
		//		
		//		for(Object hash2:linkedhash)//fetching the element through for-each loop 
		//		{
		//			System.out.println(hash2);
		//		}
		//		Iterator<Object> it1 = linkedhash.iterator();//fetching element through iterator
		//		while(it1.hasNext())
		//		{
		//			System.out.println(it1.next());
		//		}
		//		ArrayList<Object> list5= new ArrayList<>(linkedhash);//adding elements of set to list
		//	System.out.println(list5);



		TreeSet<Integer> tree= new TreeSet<>();
		tree.add(40);
		tree.add(30);
		tree.add(10);
		tree.add(20);
		//tree.add(null);//through null pointer Exception
		//	tree.add("Hi");//class cast exception
		System.out.println(tree);//sort element ascending order
		System.out.println(tree.contains(20));
		System.out.println(tree.size());;
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.descendingSet());
		Iterator<Integer> it3 = tree.descendingIterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		
		
	}

}


