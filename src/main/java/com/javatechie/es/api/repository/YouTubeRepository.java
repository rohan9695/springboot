package com.javatechie.es.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.YouTubeData;

public interface YouTubeRepository extends ElasticsearchRepository<YouTubeData, String>{

	List<YouTubeData> findByyouTubepublicid(String youTubepublicid);

}
