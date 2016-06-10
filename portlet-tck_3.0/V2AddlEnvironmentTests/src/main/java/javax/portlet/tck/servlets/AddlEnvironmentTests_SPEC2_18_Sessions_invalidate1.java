/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */


package javax.portlet.tck.servlets;

import java.io.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet for JSR 362 request dispatcher testing. Used by portlet:
 * AddlEnvironmentTests_SPEC2_18_Sessions
 *
 * @author ahmed
 *
 */
public class AddlEnvironmentTests_SPEC2_18_Sessions_invalidate1 extends HttpServlet {
  /**
   * 
   */
  private static final long serialVersionUID = 2L;
  private static final String LOG_CLASS =
      AddlEnvironmentTests_SPEC2_18_Sessions_invalidate1.class.getName();
  private final Logger LOGGER = Logger.getLogger(LOG_CLASS);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processTCKReq(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processTCKReq(req, resp);
  }

  // The tck uses only get & post requests
  protected void processTCKReq(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    LOGGER.entering(LOG_CLASS, "servlet entry");
    HttpSession httpSession = request.getSession();
    httpSession.invalidate();
    
  }
}