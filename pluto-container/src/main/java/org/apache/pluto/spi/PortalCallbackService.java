/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.spi;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pluto.PortletContainer;
import org.apache.pluto.PortletWindow;

/**
 * The callback service interface defining callback methods that will be invoked
 * by the portlet container when necessary.
 * @author <a href="mailto:ddewolf@apache.org">David H. DeWolf</a>
 * @author <a href="mailto:zheng@apache.org">ZHENG Zhong</a>
 * @version 1.0
 * @since Sep 21, 2004
 */
public interface PortalCallbackService extends ContainerService {

    /**
     * Set the title to be used for this portlet.
     * @param request  the servlet request.
     * @param portletWindow  the portlet window.
     * @param title  the title to set.
     */
    public void setTitle(HttpServletRequest request,
                         PortletWindow portletWindow,
                         String title);

    /**
     * Returns a URL provider used to constuct a URL to the given portlet.
     * @param request  the servlet request.
     * @param portletWindow  the portlet window.
     * @return the URL provider used to construct a URL to the given portlet.
     */
    public PortletURLProvider getPortletURLProvider(HttpServletRequest request,
                                                    PortletWindow portletWindow);

    /**
     * Returns a URL provider used to construct a URL to a resource in the web
     * application.
     * @param request  the servlet request.
     * @param portletWindow  the portlet window.
     * @return the URL provider used to construct a URL to a resource.
     */
    public ResourceURLProvider getResourceURLProvider(HttpServletRequest request,
                                                      PortletWindow portletWindow);

    public Map getRequestProperties(HttpServletRequest request,
                                    PortletWindow portletWindow);

    public void setResponseProperty(HttpServletRequest request,
                                    PortletWindow portletWindow,
                                    String property,
                                    String value);

    public void addResponseProperty(HttpServletRequest request,
                                    PortletWindow portletWindow,
                                    String property,
                                    String value);
    
    public EventProvider getEventProvider(HttpServletRequest request,
    		HttpServletResponse response, PortletContainer container);
    
    public EventProvider getEventProvider();
    
    /**
     * Returns a Public Render Parameter Provider, this is used to register get and set all public-render-parameter-parameter.
     * @return the PublicRenderParameterProvider.
     */
    public PublicRenderParameterProvider getPublicRenderParameterProvider();
    
    /**
     * Returns the FilterManager, this is used to process the filter.
     * @return FilterManager
     */
    public FilterManager getFilterManager(); 

}
