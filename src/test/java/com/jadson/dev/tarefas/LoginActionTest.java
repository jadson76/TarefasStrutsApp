/*
 * Copyright 2006 The Apache Software Foundation.
 *
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
 */
package com.jadson.dev.tarefas;

import junit.framework.TestCase;

import com.jadson.dev.tarefas.view.actions.LoginAction;
import com.opensymphony.xwork2.Action;

/**
 * 
 */
public class LoginActionTest extends TestCase {
    
    public void testIndexAction() throws Exception {
        LoginAction action = new LoginAction();
        String result = action.execute();
        assertEquals(Action.SUCCESS, result);
    }
}