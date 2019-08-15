/* --------------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * ------------------------------------------------------------------------------------------ */

package com.microsoft.java.lsif.core.internal.protocol;

import com.microsoft.java.lsif.core.internal.IConstant;

public class Project extends Vertex {

	private String kind;

	public Project(String id) {
		super(id, Vertex.PROJECT);
		this.kind = IConstant.JAVA_ID;
	}

	public String getKind() {
		return this.kind;
	}
}
