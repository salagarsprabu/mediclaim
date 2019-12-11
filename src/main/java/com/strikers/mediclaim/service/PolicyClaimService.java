package com.strikers.mediclaim.service;

import com.strikers.mediclaim.dto.PolicyClaimRequestDto;
import com.strikers.mediclaim.dto.PolicyClaimResponseDto;
import com.strikers.mediclaim.exception.PolicyNumberNotFoundException;

public interface PolicyClaimService {

	/**
	 * @author Sri Keerthna
	 * @since 2019-12-11
	 * @param policyClaimRequestDto
	 * @return as a response it will return reference number and message
	 * @throws PolicyNumberNotFoundException
	 */
	public PolicyClaimResponseDto applyPolicyClaim(PolicyClaimRequestDto policyClaimRequestDto) throws PolicyNumberNotFoundException;
}
