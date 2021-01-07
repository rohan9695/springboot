package com.javatechie.es.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="java",type="youtubedata",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YouTubeData {
	
	@Id
	private String youTubepublicid;
	private String youTubepublishedat;
	private String youTubetitle;
	private int youTubeduration;
	private int youTubeviewcount;
	private String youTubechannelpublicid;
	private String youTubechanneltitle;
	private int youtubecateogoryid;
	private int gamingContent;
	private int kidsContent;
	private String blacklisted;
	private int profanity;
	private int violence;
	private int sexual;
	private int drugs;
	private int hateSpeech;
	//private  description;

}
