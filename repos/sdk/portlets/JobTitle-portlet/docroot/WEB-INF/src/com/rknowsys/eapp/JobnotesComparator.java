package com.rknowsys.eapp;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.rknowsys.eapp.hrm.model.JobTitle;

public class JobnotesComparator extends OrderByComparator {
	
	
	private static final long serialVersionUID = 1L;

	public static String ORDER_BY_ASC = "status ASC";
	 
	 public static String ORDER_BY_DESC = "status DESC";
	 
	 
	  public JobnotesComparator() 
	  {
	   this(false);
	  }
	 
	  public JobnotesComparator(boolean asc) {
	   _asc = asc;
	  }
	 
	 
	 
	 public int compare(Object obj1, Object obj2) {
	   
	   JobTitle instance1 = (JobTitle) obj1;
	   JobTitle instance2 = (JobTitle) obj2;
	   
	   System.out.println("============");
	   System.out.println("instance1 === " +instance1 .getNotes().toLowerCase());
	   System.out.println("instance2 == " +instance2.getNotes().toLowerCase());
	   
	   int value = instance1.getNotes().toLowerCase().compareTo(instance2.getNotes().toLowerCase());
	 
	   if(_asc) 
	   {
	    return value;
	   } else 
	   {
	    return -value;
	   }
	    
	 }
	 
	 
	 public String getOrderBy() {
	  
	  if (_asc) {
	   return ORDER_BY_ASC;
	  } 
	  else {
	   return ORDER_BY_DESC;
	  }
	  }
	 
	 private boolean _asc;

	
	
	
	

}
