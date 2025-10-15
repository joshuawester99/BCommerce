package argon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import argon.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {

}
