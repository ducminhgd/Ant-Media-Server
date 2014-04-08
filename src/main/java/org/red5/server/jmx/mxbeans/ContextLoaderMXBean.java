/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2014 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.server.jmx.mxbeans;

import javax.management.MXBean;

/**
 * Red5 applications loader
 */
@MXBean
public interface ContextLoaderMXBean extends ShutdownMXBean {

	public void setContextsConfig(String contextsConfig);

	public void init() throws Exception;

	public void shutdown();	
	
	public void setParentContext(String parentContextKey, String appContextId);

	public String getContextsConfig();

	public void loadContext(String name, String config);
	
	public void unloadContext(String name);
	
}