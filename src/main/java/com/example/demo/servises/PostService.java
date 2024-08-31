package com.example.demo.servises;

import java.util.List;
import java.util.Map;

public interface PostService {
	

    abstract List<Map<String, Object>> getPosts();

    abstract Map<String ,Object> getPostById(int id);

    abstract Map<String ,Object> insertPosts(Map<String ,Object> payload);

    abstract Map<String ,Object> updatePosts(Map<String ,Object> payload , int id);

    abstract Map<String ,Object> deletePost( int id);

}
