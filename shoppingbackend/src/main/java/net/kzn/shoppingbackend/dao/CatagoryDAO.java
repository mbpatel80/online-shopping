package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CatagoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
