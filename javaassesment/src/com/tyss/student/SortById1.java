package com.tyss.student;

import java.util.*;

public class SortById1 implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}
}
