package com.waa.labtwo.repo;
import com.waa.labtwo.entity.Exception;
import org.springframework.data.repository.CrudRepository;

public interface ExceptionRepo extends CrudRepository<Exception,Long> {
}
