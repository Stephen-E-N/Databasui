package com.negron.databasui.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.negron.databasui.bean.Datamap;

@Repository
public interface DatamapRepository extends MongoRepository<Datamap, String>{
	
	public List<Datamap> findAll();
	public Optional<Datamap> findById(String id);
	public List<Datamap> findByDataCategoryId(String dataCategoryId);
	public List<Datamap> findByDataSize(Integer dataSize);

}
