package com.aws.codestar.projecttemplates.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericObject {
	private String flowId;
	private String jsonObject;
}
