package org.edu.service;

import java.util.List;

import javax.inject.Inject;

import org.edu.dao.IF_SampleDAO;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements IF_SampleService {
	
	@Inject
	private IF_SampleDAO sampleDAO; //sampleDAO를 가져다 쓰겠다
	
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sampleDAO.insertMember(vo);
	}

	@Override
	public List<MemberVO> selectMember() throws Exception {
		return sampleDAO.selectMember();
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		sampleDAO.updateMember(vo);
		
	}

	@Override
	public void deleteMember(String userid) throws Exception {
		sampleDAO.deleteMember(userid);
		
	}

}
