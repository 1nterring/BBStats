package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.uep.wap.model.TableOfMatches;

@Repository
public interface TableOfMatchesRepository extends CrudRepository<TableOfMatches,Long> {

}
