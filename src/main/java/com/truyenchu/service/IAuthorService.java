package com.truyenchu.service;

import com.truyenchu.dto.AuthorDTO;

public interface IAuthorService {
	Map<String, String> findAll();
	
	List<AuthorDTO> findAll();
	int getTotalItem();
	AuthorDTO findById(long id);
	AuthorDTO save(AuthorDTO dto);
	void delete(long[] ids);
}
