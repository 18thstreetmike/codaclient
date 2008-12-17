/*
 * ICodaAPI.java
 *
 * Created on October 23, 2007, 2:25 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.codalang.codaserver.httpServer;

import java.util.Hashtable;

/**
 *
 * @author michaelarace
 */

public interface ICodaAPI {
    public String login ( String username, String password, String applicationName, String environment, String groupName );
    public void logout ( String sessionKey);
    public Hashtable execute (String sessionKey, String command);
}

