package com.kerrimattingly.shophappy.models.data;

import com.kerrimattingly.shophappy.models.StoreItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kerrimattingly on 8/1/17.
 */
public interface StoreItemDao extends CrudRepository<StoreItem, Integer> {
}
