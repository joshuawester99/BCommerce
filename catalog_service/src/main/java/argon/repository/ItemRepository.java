package argon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import argon.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
