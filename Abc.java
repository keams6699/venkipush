package com.green;

public class Abc {
public static void main(String[] args) {
	class innerTest
	{public String name;
	public innerTest(String s)
	{name=s;
	}
}
	Object o=new innerTest("InnerTest1");
	innerTest t=(innerTest)o;
	System.out.println(t.name);
}}
