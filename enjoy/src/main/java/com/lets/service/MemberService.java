package com.lets.service;

import com.lets.domain.Member;

public interface MemberService {

	public int insert(Member m) throws Exception;
	
	public int isId(String id);
	
	public Member checkId(String id);
	
	public Member member_info(String id);
	
	public void delete(String id);
	
	public int update(Member m);
	
	public void memberAuth(String memberEmail,String key,String id) throws Exception;
	
	public int newPW(Member m) throws Exception;
}
