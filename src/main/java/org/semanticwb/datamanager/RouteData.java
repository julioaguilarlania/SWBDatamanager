/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.semanticwb.datamanager;

import org.semanticwb.datamanager.script.ScriptObject;

/**
 *
 * @author javiersolis
 */
public class RouteData
{
    private ScriptObject scriptObject;
    private Object handler;
    private boolean secure;
    
    /**
     *
     * @param scriptObject
     * @param handler
     */
    public RouteData(ScriptObject scriptObject, Object handler) {
        this.scriptObject = scriptObject;
        this.handler = handler;
        secure="true".equalsIgnoreCase(scriptObject.getString("isRestricted"));
    }

    /**
     *
     * @return
     */
    public boolean isSecure() {
        return secure;
    }

    /**
     *
     * @return
     */
    public ScriptObject getScriptObject() {
        return scriptObject;
    }

    /**
     *
     * @return
     */
    public Object getHandler() {
        return handler;
    }

    /**
     *
     * @param handler
     */
    public void setHandler(Object handler) {
        this.handler = handler;
    }
    
}
