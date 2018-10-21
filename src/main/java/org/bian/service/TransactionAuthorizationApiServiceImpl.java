/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class TransactionAuthorizationApiServiceImpl implements TransactionAuthorizationApiService {

	public AuthorizationWithIds authorize(Authorization request){
		return JsonReader.read("authorize-AuthorizationWithIds.json",new TypeReference<AuthorizationWithIds>(){});
	}
	
	public AuthorizationWithIds requestPost(Authorization request){
		return JsonReader.read("requestPost-AuthorizationWithIds.json",new TypeReference<AuthorizationWithIds>(){});
	}
	
	public AuthorizationWithIds requestPut(String crReferenceId, Authorization request){
		return JsonReader.read("requestPut-AuthorizationWithIds.json",new TypeReference<AuthorizationWithIds>(){});
	}
	
	public AuthorizationWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AuthorizationWithIds.json",new TypeReference<AuthorizationWithIds>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
