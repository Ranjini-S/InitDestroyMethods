package com.DanskeIt.Example;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class Student {

	@Value ("Default")
public String name;


public String id;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
@Required
public void setId(String id) {
	this.id = id;
}

public Student()
{
	System.out.println("Inside constructor");
}
@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + id + "]";
}


public void initial()
{
	System.out.println("I am in Initial method");
}


public void destroy()
{
	System.out.println("I am in destory method");
}
}
