/*
 * Copyright 2003,2004 The Apache Software Foundation.
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

package org.apache.pluto.binding.impl.digester;

import org.apache.pluto.binding.PortletPreferenceDD;

/**
 * @author <A href="mailto:ddewolf@apache.org">David H. DeWolf</A>
 * @version 1.0
 * @since Mar 11, 2004 at 4:38:36 PM
 */
public class DigesterPortletPreferenceDD implements PortletPreferenceDD {

    private String name;
    private String value;
    private boolean isReadOnly;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }

}
