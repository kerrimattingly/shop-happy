package com.kerrimattingly.shophappy.models.data;

import com.kerrimattingly.shophappy.models.Store;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kerrimattingly on 8/1/17.
 */
public interface StoreDao extends CrudRepository<Store, Integer> {
}
