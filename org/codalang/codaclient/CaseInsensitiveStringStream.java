/*
 * CaseInsensitiveStringStream.java
 *
 * Created on November 1, 2007, 10:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.codalang.codaclient;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

/**
 *
 * @author michaelarace
 */
public class CaseInsensitiveStringStream extends ANTLRStringStream {
    
    /** Creates a new instance of CaseInsensitiveStringStream */
    public CaseInsensitiveStringStream() {
    }
    
    public CaseInsensitiveStringStream(String stream) {
        super(stream);
    }
    
    public int LA(int i) {
        if ( i==0 ) {
            return 0; // undefined
	}
	
        if ( i<0 ) {
            i++; // e.g., translate LA(-1) to use offset 0 
	}

	if ( (p+i-1) >= n ) {
            //System.out.println("char LA("+i+")=EOF; p="+p);
            return CharStream.EOF;
        }
        //System.out.println("char LA("+i+")="+data.charAt(p+i-1)+";p="+p);
        return Character.toUpperCase(data[p+i-1]);
    }
}