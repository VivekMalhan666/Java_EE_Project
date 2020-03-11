package com.savelife.daos;
import java.util.List;

import com.savelife.models.Child;

public interface ChildDao {
	public boolean addChild(Child childObj);
	public boolean deleteChild(int childId);
	public boolean updateChild(Child childObj);
	public Child getChildById(int childId);
	public List<Child> getAllChildren();
	public List<Child> getSponsoredChildren();
   
}
