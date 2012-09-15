/**
 *
 *   Copyright 2011 Xavier Jodoin xjodoin@gmail.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.torpedoquery.jpa.internal.handlers;

import org.torpedoquery.jpa.Function;

public class DistinctFunctionHandler<T> extends BaseFunctionHandler<T, Function<T>> {


	public DistinctFunctionHandler(Object param) {
		super(param);
	}

	@Override
	protected String getFunctionFormat() {
		return "distinct %1$s";
	}

	
}
