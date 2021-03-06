package de.taimos.pipeline.aws;

/*-
 * #%L
 * Pipeline: AWS Steps
 * %%
 * Copyright (C) 2016 - 2017 Taimos GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class InvokeLambdaStepTest {
	
	@Test
	public void shouldConvertPayloadObjectToString() throws Exception {
		InvokeLambdaStep invokeLambdaStep = new InvokeLambdaStep("test-lambda");
		invokeLambdaStep.setPayload(Collections.singletonMap("key", "value"));
		Assert.assertEquals("{\"key\":\"value\"}", invokeLambdaStep.getPayloadAsString());
	}
	
	@Test
	public void shouldConvertPayloadListToString() throws Exception {
		InvokeLambdaStep invokeLambdaStep = new InvokeLambdaStep("test-lambda");
		invokeLambdaStep.setPayload(Collections.singletonList("elem"));
		Assert.assertEquals("[\"elem\"]", invokeLambdaStep.getPayloadAsString());
	}
	
}
