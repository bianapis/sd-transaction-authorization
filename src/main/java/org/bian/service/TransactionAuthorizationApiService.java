/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface TransactionAuthorizationApiService {

	AuthorizationWithIds authorize(Authorization request);
	
	AuthorizationWithIds requestPost(Authorization request);
	
	AuthorizationWithIds requestPut(String crReferenceId, Authorization request);
	
	AuthorizationWithIds retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
}
