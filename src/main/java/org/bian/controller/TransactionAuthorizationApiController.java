/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class TransactionAuthorizationApiController {

	@Autowired
	TransactionAuthorizationApiService service;
	
	@Assess.Authorize
	public BianResponse<AuthorizationWithIds> authorize(@RequestBody BianRequest<Authorization> bianRequest) {
		return BianResponse.forSuccess(service.authorize(bianRequest.getData()));
	}
	
	@Assess.RequestPost
	public BianResponse<AuthorizationWithIds> requestPost(@RequestBody BianRequest<Authorization> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Assess.RequestPut
	public BianResponse<AuthorizationWithIds> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Authorization> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<AuthorizationWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
