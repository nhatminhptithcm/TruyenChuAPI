package com.truyenchu.dto;

public class AuthorDTO extends AbstractDTO<AuthorDTO> {

	private String name;
	private String code;
	private String about;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
