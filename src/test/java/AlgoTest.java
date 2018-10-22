package test.java;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	
	Item one = new Item(1);
	Item two = new Item(2);
	Item three = new Item(3);
	Item four = new Item(4);
	Item five = new Item(5);

	@Test
	//The method to test the node, edge & conditional coverage
	public void bubbleSortNodeAndConditionTest() {
			
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.bubbleSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	//The method to test the edge & conditional coverage
	@Test(expected=NullPointerException.class)
	public void bubbleSortEdgeTest() {
		
		SortAlgos.bubbleSort(null);
	}
	
	
	@Test
	public void selectionSortTest() {
		
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.selectionSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void selectionSortEdgeTest() {
		
		SortAlgos.selectionSort(null);
	}
	
	@Test
	public void insertionSortTest() {
		
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.insertionSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	@Test(expected=NullPointerException.class)
	public void insertionSortEdgeTest() {
		
		SortAlgos.insertionSort(null);
	}
	
	@Test
	public void mergeSortTest() {
		
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.mergeSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	@Test(expected=NullPointerException.class)
	public void mergeSortEdgeTest() {
		
		SortAlgos.mergeSort(null);
	}
	
	@Test
	public void quickSortTest() {
		
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.quickSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	@Test
	public void quickSortTwoElementTest() {
		
		Item [] list = new Item[]{three, one};
		SortAlgos.quickSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(three.key, list[1].key);
	}
	
	@Test
	public void quickSortInOrderTest() {
		
		Item [] list = new Item[]{one, two, three, four, five};
		SortAlgos.quickSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}

	@Test(expected=NullPointerException.class)
	public void quickSortEdgeTest() {
		
		SortAlgos.quickSort(null);
	}
	
	@Test
	public void heapSortTest() {
		
		Item [] list = new Item[]{three, one, five, two, four};
		SortAlgos.heapSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
		assertEquals(four.key, list[3].key);
		assertEquals(five.key, list[4].key);
	}
	
	@Test
	public void heapSortConditionTest() {
		
		Item [] list = new Item[]{three, two, one};
		SortAlgos.heapSort(list);
		assertEquals(one.key, list[0].key);
		assertEquals(two.key, list[1].key);
		assertEquals(three.key, list[2].key);
	}
	
	@Test(expected=NullPointerException.class)
	public void heapSortEdgeTest() {
		
		SortAlgos.heapSort(null);
	}

}
