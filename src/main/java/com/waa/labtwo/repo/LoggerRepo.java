package com.waa.labtwo.repo;

import com.waa.labtwo.entity.Logger;
import org.springframework.data.repository.CrudRepository;

public interface LoggerRepo extends CrudRepository<Logger,Long> {
}
