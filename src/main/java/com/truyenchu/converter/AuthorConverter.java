package com.truyenchu.converter;

import org.springframework.stereotype.Component;

import com.truyenchu.dto.AuthorDTO;
import com.truyenchu.entity.AuthorEntity;

@Component
public class AuthorConverter {
	
	public AuthorDTO toDto(AuthorEntity entity) {
		AuthorDTO result = new AuthorDTO();
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setAbout(entity.getAbout());
		
		return result;
	}
	
	public AuthorEntity toEntity(AuthorDTO dto) {
		AuthorEntity result = new AuthorEntity();
		result.setCode(dto.getCode());
		result.setName(dto.getName());
		result.setAbout(dto.getAbout());
		return result;
	}
	
	public AuthorEntity toEntity(AuthorEntity result, AuthorDTO dto) {
		result.setCode(dto.getCode());
		result.setName(dto.getName());
		result.setAbout(dto.getAbout());
		return result;
	}
}
