/*
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rpc.server.spring.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.gwtplatform.dispatch.rpc.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.rpc.server.spring.actionvalidator.DefaultActionValidator;

/**
 * Annotation to put on handler to automatic register handler
 * with  action {@link com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler#getActionType()} and
 * validator {@link RegisterActionHandler#validator()}.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RegisterActionHandler {
    /**
     *
     * Validator type for action validation.
     */
    Class<? extends ActionValidator> validator() default DefaultActionValidator.class;
}
