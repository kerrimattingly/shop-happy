package com.kerrimattingly.shophappy.models.data;

import com.kerrimattingly.shophappy.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by kerrimattingly on 8/1/17.
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
