package com.mfpe.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class AuthenticationResponse {
	private String name;
	private String projectName;
	private boolean isValid;
	public AuthenticationResponse(String name, String projectName, boolean isValid) {
		super();
		this.name = name;
		this.projectName = projectName;
		this.isValid = isValid;
	}

}
