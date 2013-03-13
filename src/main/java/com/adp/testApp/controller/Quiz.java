package com.adp.testApp.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.springframework.util.Assert;

import com.mysql.jdbc.Clob;

/**
 * 1. Implement the function foobar.
 * 
 * 2. Implement the function isPalindrome. You do not have any additional memory
 * to create an additional array. In addition to a correct algorithm, did you
 * apply defensive programming? Did you check against bad inputs, boundary
 * conditions, etc? Drive for completeness in the solution, and eliminate all
 * bugs if possible.
 * 
 * 3. Implement the function sumExists. What is the runtime performance (Big-O)
 * of your solution? Can you achieve better than O(n^2)?
 * 
 * 4. Implement the function treeSum. The solution will use recursion. What is
 * the recursion exit condition?
 */
class Quiz {

	/**
	 * This function prints the numbers from 1 to 100. But for multiples of
	 * three print “Foo” instead of the number and for the multiples of five
	 * print “Bar” instead of the number. For numbers which are multiples of
	 * both three and five print “FooBar”.
	 */
	static void  foobar() {

		// Implement me!
		for (int i = 1; i <= 100; i++) {
			if (i % (3 * 5) == 0) {
				System.out.println(i+" FooBar");
			} else if (i % (3) == 0) {
				System.out.println(i +" Foo");
			} else if (i % 5 == 0) {
				System.out.println(i + " Bar");
			}

		}

	}

	/**
	 * Given an array of characters (i.e. a string) return true if the string is
	 * a palindrome, and false if it is not.
	 * 
	 * A palindrome is a sequence of characters which reads the same way
	 * forwards or backwards. For example, "abba" is a palindrome where-as
	 * "abcde" is not.
	 * 
	 * @param input
	 *            The input character sequence
	 * @return Returns true if <code>input</code> is a palindrome, false
	 *         otherwise.
	 */
	static boolean isPalindrome(char[] input) {

		// Implement me!
		String strInput= new String(input);
		Assert.notNull(input);
		Assert.hasLength(strInput);
		Assert.isTrue(Pattern.matches("[a-zA-Z]+",strInput)); //check for only alphabets
		String reverse = new String();
		for (int i = input.length - 1; i >= 0; i--) {
			reverse = reverse + input[i];

		}
		if (reverse.equals(new String(input)))
			return true;

		return false;
	}

	/**
	 * Given an array of integers (<code>intArray</code>), find out if any two
	 * elements in this array added together have the value of <code>sum</code>
	 * 
	 * For example, if we have intArray = [1, 5, 2, 10, 13] and sum = 11, then
	 * this method will return true because 1 + 10 = 11 (intArray[0] +
	 * intArray[3] = 11).
	 * 
	 * If sum = 99, then the value returned will be false because no 2 elements
	 * in this array add up to 99.
	 * 
	 * @param intArray
	 *            The array of source integers
	 * @param sum
	 *            The sum to find between 2 integers in <code>intArray</code>
	 * @return Returns true if <code>sum</code> is found in
	 *         <code>intArray</code> , false otherwise.
	 */
	static boolean sumExists(final int[] intArray, final int sum) {

		// Implement me!

		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] + intArray[j] == sum) {
					return true;
				}
			}

		}

		return false;

	}

	public static class TreeNode {
		int value;
		TreeNode leftSubtree;
		TreeNode rightSubtree;
	}

	/**
	 * Takes a root {@link TreeNode} and calculates the sum of all the child
	 * {@link TreeNode}s
	 * 
	 * @param node
	 *            The root node
	 * @return Returns the sum of all the node values
	 */
	public static long treeSum(TreeNode node) { 
		
		
		// Implement me!
		long sum = 0;
		if (node != null)
			sum = sum + node.value;
		
		if (node.leftSubtree != null)
			sum = sum + treeSum(node.leftSubtree);
		
		if (node.rightSubtree != null)
			sum = sum + treeSum(node.rightSubtree);

		return sum;
	}

	public static void main(String[] args) {
//	
//		Set<TreeNode> set=new LinkedHashSet<TreeNode>();
//
//		TreeNode tn = new TreeNode();
//		tn.value = 0;
//		TreeNode tn1 = new TreeNode();
//		tn1.value = 1;
//		tn.leftSubtree = tn1;
//		set.add(tn);
//		
//		TreeNode tn2 = new TreeNode();
//		tn2.value = 2;
//		tn.rightSubtree = tn2;
//
//		TreeNode tn3 = new TreeNode();
//		tn3.value = 3;
//		tn2.leftSubtree = tn3;
//		//
//		TreeNode tn4 = new TreeNode();
//		tn4.value = 4;
//		tn2.rightSubtree = tn4;
//		
//		System.out.println(treeSum(tn));
//		System.out.println(traverse(tn.leftSubtree,tn));
//		foobar();
//		
//		System.out.println("isPalindrome:" + isPalindrome(new char[]{'a','a'}));
//		System.out.println(sumExists(new int[]{1, 5, 2, 10, 13},18));
//		
//		
		createFileDir();
	}
	public static int traverse (TreeNode current, TreeNode parent) {
		int sum = 0;
		  while(current != null) {
		    if (parent != null) {
		      parent.leftSubtree = current.rightSubtree;
		      current.rightSubtree = parent;
		    }

		    if (current.leftSubtree != null) {
		      parent = current;
		      current = current.leftSubtree;
		    } else {
		     sum=sum + current.value;
		      current = current.rightSubtree;
		      parent = null;
		    }
		  }
		  return sum;
		}
	
//	public static void createFileDir(){
//		
//		Path dir = ...;
//		Files.createDirectory(path);
//		FileSystems
//
//	}
	
	public abstract interface testI{
		
		public abstract void test();
	}
	public class test{
		int userID;
		String userName;
		BigDecimal number;
		Clob image;	
		
	}
	
	

}




